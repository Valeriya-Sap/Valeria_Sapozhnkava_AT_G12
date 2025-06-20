package day17_03_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class MyBookingHover {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// 1. Перейти на сайт https://booking.com
        driver.get("https://booking.com");

// Нажать кнопку "Принять" файлы cookie
        driver.findElement(By.xpath("//button[text()='Принять']")).click();

// Отказаться входить в аккаунт
        driver.findElement(By.xpath("//button[@aria-label = 'Скрыть меню входа в аккаунт.']")).click();

// 2. Навести мышь на индикатор валюты
        WebElement currencyIcon = driver.findElement(By.xpath("//button[@data-testid='header-currency-picker-trigger']"));
        Actions make = new Actions(driver);
        make.moveToElement(currencyIcon).perform();

// 3. Проверить значение подсказки
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        String actual = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[last()]/div")))
                .getText();
//        WebElement hoverCurrency = driver.findElement(By.xpath("//div[@id=':r6l:']/div"));
//        String actual = hoverCurrency.getText();
        String expected = "Выберите валюту";
        assertEquals(expected, actual);

// 4. Навести мышь на индикатор языка
        WebElement languageIcon = driver.findElement(By.xpath("//button[@data-testid='header-language-picker-trigger']"));
        Actions make2 = new Actions(driver);
        make2.moveToElement(languageIcon).perform();

// 5. Проверить значение подсказки
        WebElement hoverLanguage = driver.findElement(By.xpath("//body/div[last()]/div"));
        String actual2 = hoverLanguage.getText();
        String expected2 = "Выберите язык";
        assertEquals(expected2, actual2);

    }

}
