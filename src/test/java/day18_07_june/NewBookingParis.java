package day18_07_june;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.booking.VoidPOBookingSearch;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.assertEquals;

public class NewBookingParis {
    public static void main(String[] args) {
        WebDriver driver = Driver.getWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        VoidPOBookingSearch booking = new VoidPOBookingSearch();
        // Перейти на сайт
        driver.get("https://booking.com");

        // Нажать кнопку "Принять" файлы cookie
        booking.acceptCookies();

        // Выбрать город "Париж"
        booking.enterCity("Париж");

        // Установить даты заезда
        driver.findElement(By.xpath("//span[@data-testid='date-display-field-start']")).click();

        LocalDate checkInDate = LocalDate.now().plusDays(3);
        LocalDate checkOutDate = checkInDate.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        driver.findElement(By.xpath("//span[@data-date='" + checkInDate.format(formatter) + "']")).click();
        driver.findElement(By.xpath("//span[@data-date='" + checkOutDate.format(formatter) + "']")).click();

        // Указать количество взрослых
        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
        WebElement adults = driver
                .findElement(By.xpath("//label[@for='group_adults']/../following-sibling::div/button[2]"));
        adults.click();
        adults.click();

        // Указать количество номеров
        WebElement room = driver
                .findElement(By.xpath("//label[@for='no_rooms']/../following-sibling::div/button[2]"));
        room.click();

        // Начать поиск
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        // Отказаться входить в аккаунт
        driver.findElement(By.xpath("//button[@aria-label = 'Скрыть меню входа в аккаунт.']")).click();

        // Отсортировать по рейтингу начиная с самого низкого
        driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']")).click();
        driver.findElement(By.xpath("//span[text()='Оценка объекта (по возрастанию)']")).click();

        // Отфильтровать отели с рейтингом 5
        driver.findElement(By.xpath("//input[@name='class=5']")).click();

        // Проверить, что у первого в списке рейтинг == 5
        String actualRate = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath("//div[@role='listitem'][1]//*[@data-testid='rating-stars']/..")))
                .getAttribute("aria-label");
        String expectedRate = "5 из 5";
        assertEquals(expectedRate, actualRate);

    }
}
