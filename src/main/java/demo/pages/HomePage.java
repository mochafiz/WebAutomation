package demo.pages;
import demo.webdriver.Webdriverinstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    public void openHomePage() {
        Webdriverinstance.driver.get("http://wikipedia.com/");
    }

    public void inputSearch (String keyword) {
        WebElement inputSearch = Webdriverinstance.driver.findElement(By.id("searchInput"));
        inputSearch.sendKeys(keyword);
    }

    public void clickSearch() {
        WebElement buttonSearch = Webdriverinstance.driver.findElement(By.xpath("//*[@type = 'submit']"));
        buttonSearch.click();
    }
}
