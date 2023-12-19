package services;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSelenium extends WebDriverSelenium {
    public ChromeDriverSelenium() {
        this.driver = new ChromeDriver();
    }
}
