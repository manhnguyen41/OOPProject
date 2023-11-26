import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.gson.Gson;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Path to the chromedriver
        System.setProperty("webdriver.chrome.driver", "/home/vietanhvu/Downloads/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Replace the URL with the one that displays more results without scrolling
        driver.get("https://twitter.com/search?q=nft&src=typed_query");

        // Set the initial timeout for waiting for elements
        Duration timeout = Duration.ofSeconds(1000);
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        // Use a css selector that matches any of the specified classes
        By cssSelector = By.cssSelector(".css-175oi2r.r-1igl3o0.r-qklmqi.r-1adg3ll.r-1ny4l3l");

        // Perform initial wait for the presence of elements
        wait.until(ExpectedConditions.presenceOfElementLocated(cssSelector));

        // Scroll down the page to load more content
        for (int i = 0; i < 30; i++) {  // You may need to adjust the loop count based on your needs
            // Execute JavaScript to scroll down
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

            // Wait for a short duration to let the content load
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Find elements with the specific class
        List<WebElement> elements = driver.findElements(cssSelector);

        List<WebElementData> dataList = new ArrayList<>();

        for (WebElement element : elements) {
            WebElementData data = new WebElementData();
            data.setTagName(element.getTagName());
            data.setText(element.getText());
            dataList.add(data);
        }

        Gson gson = new Gson();
        String json = gson.toJson(dataList);

        System.out.println(json);

        // Close the browser
        driver.quit();
    }
}
