package services;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public interface IWebDriver<TypeElement, Mechanism> {
    void get(String url);

    void quit();

    TypeElement findElement(Mechanism by);

    List<TypeElement> findElements(Mechanism by);

    WebDriverWait createWebDriverWait(Duration timeout);
}
