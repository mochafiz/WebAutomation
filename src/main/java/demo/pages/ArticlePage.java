package demo.pages;

import demo.webdriver.Webdriverinstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArticlePage {

    public String getTitle() {
        WebElement titleArticle = Webdriverinstance.driver.findElement(By.id("firstHeading"));
        String title = titleArticle.getText();
        return title;
    }

}
