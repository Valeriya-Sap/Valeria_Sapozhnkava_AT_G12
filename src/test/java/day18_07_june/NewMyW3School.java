package day18_07_june;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class NewMyW3School {
    public static void main(String[] args) {
        WebDriver driver = Driver.getWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        1. Перейти на сайт https://www.w3schools.com/java/
        driver.get("https://www.w3schools.com/java/");

        // Нажать кнопку cookie
        driver.findElement(By.xpath("//div[@id='accept-choices']")).click();

//        2. Двойным кликом выделить в заголовке слово Tutorial
//        3. Скопировать используя горячие клавиши Ctrl+c
        WebElement tutorial = driver.findElement(By.xpath("//h1/span[text()='Tutorial']"));
        Actions make = new Actions(driver);
        make
                .doubleClick(tutorial)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .perform();

//        4. Перейти на сайт https://google.com
        WebDriver driver2 = new ChromeDriver(options);
        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver2.get("https://google.com");
        driver2.findElement(By.xpath("//div[text()='Принять все']/..")).click();

//        5. Вставить в строку поиска скопированное
//        6. Запустить поиск клавишей Enter
        WebElement search = driver2.findElement(By.name("q"));
        Actions make2 = new Actions(driver2);
        make2
                .click(search)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyDown(Keys.ENTER)
                .perform();

//        7. Убедиться, что каждый из результатов содержит искомое слово
        List<WebElement> resultTitles = driver2.findElements(By.xpath("//h3"));
        String expectedText = "tutorial";
        for (WebElement title : resultTitles) {
            String actualText = title.getText().toLowerCase();
            assertTrue(actualText.contains(expectedText));
        }
    }
}
