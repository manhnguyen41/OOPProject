package crawlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import services.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Crawler<T> {
    protected static int ID = 0;
    protected List<T> objects;
    protected IWebDriver<WebElement, By> driver;
    protected final IJsonHandler gson;
    protected final List<String> PAGE_URLs = new ArrayList<>();
    protected final String JSON_FILE_PATH;


    public Crawler(String json_file_path, String... page_urls) {
        driver = new ChromeDriverSelenium();
        gson = new GsonHandler();
        objects = new ArrayList<>();
        this.JSON_FILE_PATH = json_file_path;
        Collections.addAll(this.PAGE_URLs, page_urls);
    }

    public void run() throws IOException {
        crawlData();
        saveDataToFile();
        driver.quit();
    }

    public void saveDataToFile() throws IOException {
        // convert the list to a JSON array
        String json = gson.toJson(objects);

        // write the JSON array to a file
        FileWriter writer = new FileWriter(JSON_FILE_PATH);
        writer.write(json);
        writer.close();
    }

    public void waitForPresenceOfEl(String[] cssOfEls) {
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = driver.createWebDriverWait(timeout);
        for (String cssOfEl : cssOfEls) {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.className(cssOfEl)));
        }
    }

    public abstract void crawlData() throws UnsupportedEncodingException;
}
