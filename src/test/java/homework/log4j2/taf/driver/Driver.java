package homework.log4j2.taf.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = getWebDriver();
        }
        return driver;
    }

    private static WebDriver getWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driverTime = new ChromeDriver(options);
        driverTime.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driverTime;
    }

    public static void resetDriver() {
        if (driver != null) {
            driver.quit();
        }
        driver = null;
    }
}
