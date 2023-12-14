package crawlers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Blog;
import models.Collection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

public class BlogCrawler extends Crawler<Blog> {
    private static final String JSON_PATH = "data/Blog.json";
    // Get list collection from Json file
    private static final List<Collection> collections = readCollectionsFromJson();

    public BlogCrawler(String json_file_path, String... page_urls) {
        super(json_file_path, page_urls);
    }

    public static void main(String[] args) throws IOException {
        String[] urls = makeUrls();
        BlogCrawler blogCrawler = new BlogCrawler(JSON_PATH, urls);
        blogCrawler.run();
    }

    public static String[] makeUrls() {
        String BASE_URL = "https://www.nft-stats.com/search?query=";
        // make url request
        String[] urls = new String[collections.size()];
        for (int i = 0; i < collections.size(); i++) {
            System.out.println(collections.get(i).getName());
            // base url + collection name
            urls[i] = BASE_URL + collections.get(i).getName().replace(" ", "+");
        }
        return urls;
    }

    public static List<Collection> readCollectionsFromJson() {
        Gson gson = new Gson();
        List<Collection> collectionList = null;
        try (FileReader reader = new FileReader("data/Collection.json")) {
            Type type = new TypeToken<List<Collection>>() {
            }.getType();
            collectionList = gson.fromJson(reader, type);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Use Set to filter Collections with unique names
        Set<String> uniqueNames = new HashSet<>();
        List<Collection> uniqueCollections = new ArrayList<>();

        for (Collection collection : collectionList) {
            if (uniqueNames.add(collection.getName())) {
                uniqueCollections.add(collection);
            }
        }

        return uniqueCollections;
    }

    @Override
    public void crawlData() {
        for (int i = 0; i < PAGE_URLs.size(); i++) {
            driver.get(PAGE_URLs.get(i));
            waitForPresenceOfEl(new String[]{"card-body"});
            List<WebElement> webElements = driver.findElements(By.className("card-body"));
            for (WebElement webElement : webElements) {
                String[] webElementContents = webElement.getText().split("\n");

                String title = webElementContents[0];
                String[] descriptionArray = Arrays.copyOfRange(webElementContents, 2, webElementContents.length);
                String description = String.join(" ", descriptionArray);
                WebElement linkElement = webElement.findElement(By.tagName("a"));
                String link = linkElement.getAttribute("href");

                objects.add(new Blog(title, description, link, collections.get(i).getName()));
            }
        }
    }
}
