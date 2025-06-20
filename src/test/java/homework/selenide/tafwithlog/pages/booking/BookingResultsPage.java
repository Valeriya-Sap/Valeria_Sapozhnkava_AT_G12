package homework.selenide.tafwithlog.pages.booking;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class BookingResultsPage {
    private static final Logger LOGGER = LogManager.getLogger(BookingResultsPage.class);

    private static String HIDE_BUTTON_XPATH = "//button[@aria-label = 'Скрыть меню входа в аккаунт.']";
    private static String SORT_BUTTON_XPATH = "//button[@data-testid='sorters-dropdown-trigger']";
    private static String RATING_ASC_XPATH = "//span[text()='Оценка объекта (по возрастанию)']";
    private static String RATING_FIVE_XPATH = "//input[@name='class=5']";
    private static String RATING_NINE_PLUS_XPATH = "//div[text()='Превосходно: 9+']";
    private static String FIRST_HOTEL_RATING_XPATH = "//div[@role='listitem'][1]//*[@data-testid='rating-stars']/..";
    private static String FIRST_HOTEL_TITLE_XPATH = "//div[@role='listitem'][1]//div[@data-testid='title']";
    private static String TENTH_HOTEL_XPATH = "//div[@role='listitem'][10]";

    public BookingResultsPage() {
    }

    public void refuseLogIn() {
        $x(HIDE_BUTTON_XPATH).click();
        LOGGER.trace("Click 'Скрыть меню входа в аккаунт.' xpath {}", HIDE_BUTTON_XPATH);
    }

    public void sortByRatingAsc() {
        $x(SORT_BUTTON_XPATH).click();
        LOGGER.trace("Click sort button xpath {}", SORT_BUTTON_XPATH);
        $x(RATING_ASC_XPATH).click();
        LOGGER.trace("Click 'Оценка объекта (по возрастанию)' xpath{}", RATING_ASC_XPATH);
    }

    public void filterByRatingFive() {
        $x(RATING_FIVE_XPATH).click();
        LOGGER.trace("Check checkbox 5 stars xpath {}", RATING_ASC_XPATH);
    }

    public void filterByNinePlus() {
        $x(RATING_NINE_PLUS_XPATH).click();
        LOGGER.trace("Check checkbox 9+ stars xpath {}", RATING_NINE_PLUS_XPATH);
    }

    public String getFirstHotelRating() {
        $x(FIRST_HOTEL_RATING_XPATH).shouldBe(Condition.visible, Duration.ofSeconds(10));
        String firstHotelRating = $x(FIRST_HOTEL_RATING_XPATH).getAttribute("aria-label");
        LOGGER.trace("Get rating from first hotel {}", FIRST_HOTEL_RATING_XPATH);
        return firstHotelRating;
    }

    public void openFirstHotel() {
        $x(FIRST_HOTEL_TITLE_XPATH).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        switchTo().window(1);
        LOGGER.trace("Open first hotel {}", FIRST_HOTEL_TITLE_XPATH);
    }

    public void scrollToTenHotel() {
        SelenideElement tenHotel = $x(TENTH_HOTEL_XPATH);
        tenHotel.scrollIntoView("{behavior: 'smooth', block: 'center'}");
        tenHotel.shouldBe(Condition.enabled, Duration.ofSeconds(10)).click();
        LOGGER.trace("Scroll to the tenth hotel {}", TENTH_HOTEL_XPATH);
    }

    public void beautifyPage() {
        SelenideElement tenHotel = $x(TENTH_HOTEL_XPATH);
        executeJavaScript("arguments[0].style.backgroundColor = 'green';", tenHotel);
        SelenideElement hotelTitle = tenHotel.$("div[data-testid='title']");
        executeJavaScript("arguments[0].style.color = 'red';", hotelTitle);
        LOGGER.trace("Beatify the hotel");
    }

}
