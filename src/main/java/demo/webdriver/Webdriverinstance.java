package demo.webdriver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class Webdriverinstance {

    public static WebDriver driver;

    public static void initialize(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized", "incognito", "disable-infobars");

        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void quit() {
        driver.quit();
    }

}
