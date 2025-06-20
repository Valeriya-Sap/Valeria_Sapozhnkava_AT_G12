package homework.selenide.tafwithlog.pages.booking;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Selenide.*;

public class BookingSearchPage {
    private static final Logger LOGGER = LogManager.getLogger(BookingSearchPage.class);
    private static String SEARCH_NAME = "ss";
    private static String ACCEPT_XPATH = "//button[text()='Принять']";
    private static String CALENDER_XPATH = "//span[@data-testid='date-display-field-start']";
    private static String DATE_XPATH_FORMAT = "//span[@data-date='%s']";
    private static String OCCUPANCY_CONFIG_XPATH = "//button[@data-testid='occupancy-config']";
    private static String ADULTS_XPATH = "//label[@for='group_adults']/../following-sibling::div/button[2]";
    private static String ROOMS_XPATH = "//label[@for='no_rooms']/../following-sibling::div/button[2]";
    private static String SUBMIT_BUTTON_XPATH = "//button[@type = 'submit']";
    private static String HIDE_BUTTON_XPATH = "//button[@aria-label = 'Скрыть меню входа в аккаунт.']";
    private static String CURRENCY_PICKER_XPATH = "//button[@data-testid='header-currency-picker-trigger']";
    private static String LANGUAGE_PICKER_XPATH = "//button[@data-testid='header-language-picker-trigger']";
    private static String TOOLTIP_XPATH = "//body/div[last()]/div";

    public BookingSearchPage() {
    }

    public void openBooking() {
        open("https://booking.com");
        LOGGER.trace("Booking is opened.");
    }

    public void acceptCookies() {
        $x(ACCEPT_XPATH).click();
        LOGGER.trace("Click on element with xpath {}", ACCEPT_XPATH);
    }

    public void enterCity(String city) {
        $(By.name(SEARCH_NAME)).sendKeys(city);
        LOGGER.trace("Fill the field name {} by city", SEARCH_NAME);
    }

    public void selectDates(LocalDate checkInDate, LocalDate checkOutDate) {
        $x(CALENDER_XPATH).click();
        LOGGER.trace("Select field data xpath {}", CALENDER_XPATH);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        $x(String.format(DATE_XPATH_FORMAT, checkInDate.format(formatter))).click();
        LOGGER.trace("Select checkin xpath {}", DATE_XPATH_FORMAT);
        $x(String.format(DATE_XPATH_FORMAT, checkOutDate.format(formatter))).click();
        LOGGER.trace("Select checkout xpath {}", DATE_XPATH_FORMAT);
    }

    public void enterAdultsNumber(int adultsNumber) {
        $x(OCCUPANCY_CONFIG_XPATH).click();
        WebElement adults = $x(ADULTS_XPATH);
        while (adultsNumber > 2) {
            adults.click();
            adultsNumber--;
        }
        LOGGER.trace("Add adults number xpath {}", OCCUPANCY_CONFIG_XPATH);
        $x(OCCUPANCY_CONFIG_XPATH).click();
    }

    public void enterRoomNumber(int roomNumber) {
        $x(OCCUPANCY_CONFIG_XPATH).click();
        WebElement room = $x(ROOMS_XPATH);
        while (roomNumber > 1) {
            room.click();
            roomNumber--;
        }
        LOGGER.trace("Add rooms number xpath {}", ROOMS_XPATH);
        $x(OCCUPANCY_CONFIG_XPATH).click();
    }

    public void clickSubmit() {
        $x(SUBMIT_BUTTON_XPATH).click();
        LOGGER.trace("Click the submit button xpath {}", SUBMIT_BUTTON_XPATH);
    }

    public void refuseLogIn() {
        $x(HIDE_BUTTON_XPATH).click();
        LOGGER.trace("Click 'Скрыть меню входа в аккаунт.' xpath {}", HIDE_BUTTON_XPATH);
    }

    public String getCurrencyTooltipValue() {
        SelenideElement currencyIcon = $x(CURRENCY_PICKER_XPATH);
        currencyIcon.hover();
        LOGGER.trace("Hover the icon xpath {}", CURRENCY_PICKER_XPATH);
        $x(TOOLTIP_XPATH).shouldBe(Condition.visible, Duration.ofSeconds(10));
        String tooltipValue = $x(TOOLTIP_XPATH).getText();
        actions().moveByOffset(-100, 0).perform();
        $x(TOOLTIP_XPATH).shouldNotBe(Condition.visible, Duration.ofSeconds(10));
        return tooltipValue;
    }

    public String getLanguageTooltipValue() {
        SelenideElement languageIcon = $x(LANGUAGE_PICKER_XPATH);
        languageIcon.hover();
        LOGGER.trace("Hover the icon xpath {}", LANGUAGE_PICKER_XPATH);
        $x(TOOLTIP_XPATH).shouldBe(Condition.visible, Duration.ofSeconds(10));
        String tooltipValue = $x(TOOLTIP_XPATH).getText();
        actions().moveByOffset(-100, 0).perform();
        $x(TOOLTIP_XPATH).shouldNotBe(Condition.visible, Duration.ofSeconds(10));
        return tooltipValue;
    }

}
