package homework.log4j2.taf.pages.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import homework.log4j2.taf.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookingSearchPage {
    private static final Logger LOGGER = LogManager.getLogger(BookingSearchPage.class);
    WebDriver driver = Driver.getDriver();
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
        driver.get("https://booking.com");
        LOGGER.trace("Booking is opened.");
    }

    public void acceptCookies() {
        driver.findElement(By.xpath(ACCEPT_XPATH)).click();
        LOGGER.trace("Click on element with xpath {}", ACCEPT_XPATH);
    }

    public void enterCity(String city) {
        driver.findElement(By.name(SEARCH_NAME)).sendKeys(city);
        LOGGER.trace("Fill the field name {} by city", SEARCH_NAME);
    }

    public void selectDates(LocalDate checkInDate, LocalDate checkOutDate) {
        driver.findElement(By.xpath(CALENDER_XPATH)).click();
        LOGGER.trace("Select field data xpath {}", CALENDER_XPATH);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        driver.findElement(By.xpath(String.format(DATE_XPATH_FORMAT, checkInDate.format(formatter)))).click();
        LOGGER.trace("Select checkin xpath {}", DATE_XPATH_FORMAT);
        driver.findElement(By.xpath(String.format(DATE_XPATH_FORMAT, checkOutDate.format(formatter)))).click();
        LOGGER.trace("Select checkout xpath {}", DATE_XPATH_FORMAT);
    }

    public void enterAdultsNumber(int adultsNumber) {
        driver.findElement(By.xpath(OCCUPANCY_CONFIG_XPATH)).click();
        WebElement adults = driver.findElement(By.xpath(ADULTS_XPATH));
        while (adultsNumber > 2) {
            adults.click();
            adultsNumber--;
        }
        LOGGER.trace("Add adults number xpath {}", OCCUPANCY_CONFIG_XPATH);
        driver.findElement(By.xpath(OCCUPANCY_CONFIG_XPATH)).click();
    }

    public void enterRoomNumber(int roomNumber) {
        driver.findElement(By.xpath(OCCUPANCY_CONFIG_XPATH)).click();
        WebElement room = driver.findElement(By.xpath(ROOMS_XPATH));
        while (roomNumber > 1) {
            room.click();
            roomNumber--;
        }
        LOGGER.trace("Add rooms number xpath {}", ROOMS_XPATH);
        driver.findElement(By.xpath(OCCUPANCY_CONFIG_XPATH)).click();
    }

    public void clickSubmit() {
        driver.findElement(By.xpath(SUBMIT_BUTTON_XPATH)).click();
        LOGGER.trace("Click the submit button xpath {}", SUBMIT_BUTTON_XPATH);
    }

    public void refuseLogIn() {
        driver.findElement(By.xpath(HIDE_BUTTON_XPATH)).click();
        LOGGER.trace("Click 'Скрыть меню входа в аккаунт.' xpath {}", HIDE_BUTTON_XPATH);
    }

    public String getCurrencyTooltipValue() {
        WebElement currencyIcon = driver.findElement(By.xpath(CURRENCY_PICKER_XPATH));
        Actions make = new Actions(driver);
        make.moveToElement(currencyIcon).perform();
        LOGGER.trace("Hover the icon xpath {}", CURRENCY_PICKER_XPATH);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        String tooltipValue = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TOOLTIP_XPATH)))
                .getText();

        make.moveToLocation(0, 0).perform();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(TOOLTIP_XPATH)));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return tooltipValue;
    }

    public String getLanguageTooltipValue() {
        WebElement currencyIcon = driver.findElement(By.xpath(LANGUAGE_PICKER_XPATH));
        Actions make = new Actions(driver);
        make.moveToElement(currencyIcon).perform();
        LOGGER.trace("Hover the icon xpath {}", LANGUAGE_PICKER_XPATH);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        String tooltipValue = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TOOLTIP_XPATH)))
                .getText();

        make.moveToLocation(0, 0).perform();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(TOOLTIP_XPATH)));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return tooltipValue;
    }

}
