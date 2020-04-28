package demo;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import demo.webdriver.Webdriverinstance;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();

//    @Test
//    public void searchOnWikitionary() throws InterruptedException {
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized", "incognito", "disable-infobars");
//
//        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
//        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
//
//        WebDriver driver = new ChromeDriver(options);
//
////        driver.manage().window().maximize();
//
//        driver.get("http://wikipedia.com/");
//
//        WebElement inputSearch = driver.findElement(By.id("searchInput"));
//        inputSearch.sendKeys("apple");
//
//        WebElement buttonSearch = driver.findElement(By.xpath("//*[@type = 'submit']"));
//        buttonSearch.click();
//
//        WebElement titleArticle = driver.findElement(By.id("firstHeading"));
//        String title = titleArticle.getText();
//
//        Assert.assertEquals("Apple", title);
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        Thread.sleep(5000);
//
//        driver.quit();
//    }

    @Before
    public void before() {
        Webdriverinstance.initialize();
    }

    @After
    public void after() {
        Webdriverinstance.quit();
    }

    @Test
    public void searching() {
        homePage.openHomePage();
        homePage.inputSearch("Apple");
        homePage.clickSearch();
        String title = articlePage.getTitle();
        Assert.assertEquals("Apple", title);
    }
}
