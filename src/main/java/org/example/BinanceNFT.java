package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BinanceNFT {
    public static void main(String[] args) {
        String url = "https://www.binance.com/en/nft/ranking?tab=trend&chain=ALL";

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(url);
        driver.findElement(By.cssSelector("button.css-amo4x7")).click();
        driver.findElement(By.xpath("//*[@id=\"__APP\"]/div/div[2]/main/div/div/div/div[1]/div[2]/div[2]/div[4]")).click();
        // Find the table element using xpath
        WebElement table = driver.findElement(By.xpath("//*[@id=\"__APP\"]/div/div[2]/main/div/div/div/div[2]/div/div[2]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.css-vurnku")));
        List<WebElement> mainVersions = table.findElements(By.cssSelector("div.css-vurnku"));

        for(WebElement mver: mainVersions) {
            WebElement a = mver.findElement(By.tagName("div"));
            List<WebElement> b = a.findElements(By.tagName("div"));
            WebElement c = b.get(0);
            WebElement d = b.get(1);
            WebElement e = c.findElement(By.cssSelector("div.css-1wr4jig"));
            WebElement f = e.findElement(By.cssSelector("div.css-10nf7hq"));
            System.out.println(f.findElement(By.tagName("div")).getText());
        }
        driver.quit();
    }

}
