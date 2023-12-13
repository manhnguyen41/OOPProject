package crawlers;

import models.Collection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class CollectionCrawler extends Crawler<Collection> {
    private static final String URL = "https://www.binance.com/en/nft/ranking?tab=collection";
    private static final String JSON_PATH = "data/Collection.json";

    public CollectionCrawler(String json_file_path, String... page_urls) {
        super(json_file_path, page_urls);
    }

    public static void main(String[] args) throws IOException {
        CollectionCrawler binanceNFTCrawler = new CollectionCrawler(JSON_PATH, URL);
        binanceNFTCrawler.run();
    }

    @Override
    public void crawlData() {
        for (String PAGE_URL : PAGE_URLs) {
            driver.get(PAGE_URL);
            Duration timeout = Duration.ofSeconds(100);
            WebDriverWait wait = driver.createWebDriverWait(timeout);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("css-kyd4a2")));

            List<WebElement> webElements = driver.findElements(By.className("css-kyd4a2"));

            for (int i = 0; i < webElements.size(); i++) {
                String[] webElementContents = webElements.get(i).getText().split("\n");
                // Sử dụng filter để loại bỏ các phần tử chứa '%'
                String[] filteredContents = Arrays.stream(webElementContents)
                        .filter(element -> !element.contains("%"))
                        .toArray(String[]::new);
                System.out.println(Arrays.toString(filteredContents));
                String name = i < 3 ? filteredContents[0] : filteredContents[1];
                String volume = i < 3 ? filteredContents[1] : filteredContents[2];
                String change = i < 3 ? filteredContents[2] : filteredContents[3];
                String floorPrice = i < 3 ? filteredContents[3] : filteredContents[4];
                String owners = i < 3 ? filteredContents[5] : filteredContents[6];
                String items = i < 3 ? filteredContents[6] : filteredContents[7];

                objects.add(new Collection(name, volume, change, floorPrice, owners, items));
            }
        }
    }
}
