package Classwork.day21_17_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class BookingParisSelenide {
    public static void main(String[] args) {
        // Перейти на сайт
        open("https://booking.com");

        // Нажать кнопку "Принять" файлы cookie
        $x("//button[text()='Принять']").click();

        // Отказаться входить в аккаунт
        $x(("//button[@aria-label = 'Скрыть меню входа в аккаунт.']")).click();

        // Выбрать город "Париж"
        $(By.name("ss")).sendKeys("Париж");

        // Установить даты заезда
        $x(("//span[@data-testid='date-display-field-start']")).click();

        LocalDate checkInDate = LocalDate.now().plusDays(3);
        LocalDate checkOutDate = checkInDate.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        $x(("//span[@data-date='" + checkInDate.format(formatter) + "']")).click();
        $x(("//span[@data-date='" + checkOutDate.format(formatter) + "']")).click();

        // Указать количество взрослых
        $x(("//button[@data-testid='occupancy-config']")).click();
        WebElement adults = $x(("//label[@for='group_adults']/../following-sibling::div/button[2]"));
        adults.click();
        adults.click();

        // Указать количество номеров
        WebElement room = $x(("//label[@for='no_rooms']/../following-sibling::div/button[2]"));
        room.click();

        // Начать поиск
        $x(("//button[@type = 'submit']")).click();


        // Отсортировать по рейтингу начиная с самого низкого
        $x(("//button[@data-testid='sorters-dropdown-trigger']")).click();
        $x(("//span[text()='Оценка объекта (по возрастанию)']")).click();

        // Отфильтровать отели с рейтингом 5
        $x(("//input[@name='class=5']")).click();

        // Проверить, что у первого в списке рейтинг == 5
        $x("//div[@role='listitem'][1]//*[@data-testid='rating-stars']/..")
                .shouldHave(attribute("aria-label", "5 из 5"));

    }

}
