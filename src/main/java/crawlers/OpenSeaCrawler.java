package crawlers;

import models.Collection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class OpenSeaCrawler extends Crawler<Collection> {
    private static final String URL = "https://opensea.io/rankings/trending?sortBy=one_day_volume";
    private static final String JSON_PATH = "data/OpenSea.json";

    public OpenSeaCrawler(String json_file_path, String... page_urls) {
        super(json_file_path, page_urls);
    }

    public static void main(String[] args) throws IOException {
        OpenSeaCrawler openSeaCrawler = new OpenSeaCrawler(JSON_PATH, URL);
        openSeaCrawler.run();
    }

    @Override
    public void crawlData() {
        for (String PAGE_URL : PAGE_URLs) {
            driver.get(PAGE_URL);
            Duration timeout = Duration.ofSeconds(100);
            WebDriverWait wait = driver.createWebDriverWait(timeout);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class*='sc-beff130f-0']")));
            List<WebElement> webElements = driver.findElements(By.cssSelector("div.sc-beff130f-0.sc-e7b51c31-0.hksMfk.fWxQZN"));


            for (WebElement webElement : webElements) {
                System.out.println(webElement.getText());
            }

        }
    }
}
