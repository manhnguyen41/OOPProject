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
    private static String BASE_URL = "https://www.nft-stats.com/search?query=";
    private static final String JSON_PATH = "data/Blog.json";
    // Get list collection from Json file
    private static List<Collection> collections = readCollectionsFromJson();


    public BlogCrawler(String json_file_path, String... page_urls) {
        super(json_file_path, page_urls);
    }

    public static void main(String[] args) throws IOException {


        // make url request
        String[] urls = new String[uniqueCollections.size()];
        for (int i = 0; i < uniqueCollections.size(); i++) {
            System.out.println(uniqueCollections.get(i).getName());
            // base url + collection name
            urls[i] = BASE_URL + uniqueCollections.get(i).getName().replace(" ", "+");
        }

        // Remove null elements from the urls array
        List<String> nonNullUrlsList = new ArrayList<>();
        for (String url : urls) {
            if (url != null) {
                nonNullUrlsList.add(url);
            }
        }

        // Convert the list of non-null URLs back to an array
        String[] nonNullUrls = nonNullUrlsList.toArray(new String[0]);
        BlogCrawler blogCrawler = new BlogCrawler(JSON_PATH, nonNullUrls);
        blogCrawler.run();
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

        for (Collection collection : collections) {
            if (uniqueNames.add(collection.getName())) {
                uniqueCollections.add(collection);
            }
        }

        return collectionList;
    }

    @Override
    public void crawlData() {
        for (String PAGE_URL : PAGE_URLs) {
            driver.get(PAGE_URL);
            List<WebElement> webElements = driver.findElements(By.className("card-body"));
            for (WebElement webElement : webElements) {
                String[] webElementContents = webElement.getText().split("\n");
                String title = webElementContents[0];
                String info = webElementContents[1];
                String[] descriptionArray = Arrays.copyOfRange(webElementContents, 2, webElementContents.length);
                String description = String.join(" ", descriptionArray);

                WebElement linkElement = webElement.findElement(By.tagName("a"));
                String link = linkElement.getAttribute("href");

                WebElement imgElement = webElement.findElement(By.tagName("img"));
                String imgSrc = imgElement.getAttribute("src");

                objects.add(new Blog(title, info, imgSrc, description, link));
            }
        }
    }
}
