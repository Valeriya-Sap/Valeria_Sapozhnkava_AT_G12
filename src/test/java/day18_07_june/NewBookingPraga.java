package day18_07_june;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.booking.VoidPOBookingSearch;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class NewBookingPraga {
    public static void main(String[] args) {
        WebDriver driver = Driver.getWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        VoidPOBookingSearch booking = new VoidPOBookingSearch();

//        1. Перейти на сайт booking.com
        driver.get("https://booking.com");

        // Нажать кнопку "Принять" файлы cookie
        booking.acceptCookies();
        //driver.findElement(By.xpath("//button[text()='Принять']")).click();

//        2. Ввести в поиск «Прага», выбрать для проживания 2 гостей и 1 номер.
        booking.enterCity("Прага");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Прага']")))
                .click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        // Отказаться входить в аккаунт
        driver.findElement(By.xpath("//button[@aria-label = 'Скрыть меню входа в аккаунт.']")).click();

//        3. Отфильтровать отели с максимальным рейтингом
        driver.findElement(By.xpath("//div[text()='Превосходно: 9+']")).click();

//        4. Открыть страницу с первым таким отелем и проверить, что его рейтинг >=9
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath("//div[@role='listitem'][1]//div[@data-testid='title']")))
                .click();
        String score = driver.findElement(By.xpath("//div[@data-testid='review-score-right-component']/div[2]"))
                .getText();
        double number = Double.parseDouble(score);

        assertTrue(number >= 9);

    }
}
