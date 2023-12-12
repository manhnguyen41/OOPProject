package services;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSelenium extends WebDriverSelenium {
    public ChromeDriverSelenium() {
//        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/home/vietanhvu/Downloads/chromedriver-linux64/chromedriver");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        this.driver = new ChromeDriver(options);
        this.driver = new ChromeDriver();
    }
}
