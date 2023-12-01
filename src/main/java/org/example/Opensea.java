package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Opensea {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://opensea.io/rankings?sortBy=total_volume";

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(url);
        // Find the table element using xpath
        // Create an instance of the JavascriptExecutor interface
//        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down to the bottom of the webpage
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement table = driver.findElement(By.xpath("//*[@id=\"main\"]/main/div/div[1]/div[3]/div/div[4]"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.sc-beff130f-0.sc-e7b51c31-0.hksMfk.fWxQZN")));
        List<WebElement> mainVersions = table.findElements(By.cssSelector("div.sc-beff130f-0.sc-e7b51c31-0.hksMfk.fWxQZN"));
////
        for(WebElement mver: mainVersions) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(mver.getText());
//            WebElement a = mver.findElement(By.tagName("div"));
//            List<WebElement> b = a.findElements(By.tagName("div"));
//            WebElement c = b.get(0);
//            WebElement d = b.get(1);
//            WebElement e = c.findElement(By.cssSelector("div.css-1wr4jig"));
//            WebElement f = e.findElement(By.cssSelector("div.css-10nf7hq"));
//            System.out.println(f.findElement(By.tagName("div")).getText());
        }
////        System.out.println(table.getText());
//        System.out.println(mainVersions.get(12).getText());
        driver.quit();
    }

}
