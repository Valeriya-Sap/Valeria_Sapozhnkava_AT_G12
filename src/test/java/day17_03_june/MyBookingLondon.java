package day17_03_june;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class MyBookingLondon {
    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        1. Перейти на сайт booking.com
        driver.get("https://booking.com");

        // Нажать кнопку "Принять" файлы cookie
        driver.findElement(By.xpath("//button[text()='Принять']")).click();

//        2. Найти отели для города «London»
        driver.findElement(By.name("ss")).sendKeys("London");
        //  Thread.sleep(500L);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='London']")))
                .click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        // Отказаться входить в аккаунт
        driver.findElement(By.xpath("//button[@aria-label = 'Скрыть меню входа в аккаунт.']")).click();

//        3. Проскролить страницу к 10-му отелю сверху
        WebElement tenHotel = driver.findElement(By.xpath("//div[@role='listitem'][10]"));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", tenHotel);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listitem'][10]")))
                .click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        4. Изменить цвет фона на зеленый, а цвет текста названия на красный
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green';", tenHotel);
        WebElement hotelTitle = tenHotel.findElement(By.cssSelector("div[data-testid='title']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red';", hotelTitle);

//        5. Сделать скриншот
        File asFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File directory = new File("screenshorts/booking_London.png");
        FileUtils.copyFile(asFile, directory);
    }
}
