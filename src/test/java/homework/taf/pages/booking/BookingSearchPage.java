package homework.taf.pages.booking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import homework.taf.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookingSearchPage {
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
    }

    public void acceptCookies() {
        driver.findElement(By.xpath(ACCEPT_XPATH)).click();
    }

    public void enterCity(String city) {
        driver.findElement(By.name(SEARCH_NAME)).sendKeys(city);
    }

    public void selectDates(LocalDate checkInDate, LocalDate checkOutDate) {
        driver.findElement(By.xpath(CALENDER_XPATH)).click();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        driver.findElement(By.xpath(String.format(DATE_XPATH_FORMAT, checkInDate.format(formatter)))).click();
        driver.findElement(By.xpath(String.format(DATE_XPATH_FORMAT, checkOutDate.format(formatter)))).click();
    }

    public void enterAdultsNumber(int adultsNumber) {
        driver.findElement(By.xpath(OCCUPANCY_CONFIG_XPATH)).click();
        WebElement adults = driver.findElement(By.xpath(ADULTS_XPATH));
        while (adultsNumber > 2) {
            adults.click();
            adultsNumber--;
        }
        driver.findElement(By.xpath(OCCUPANCY_CONFIG_XPATH)).click();
    }

    public void enterRoomNumber(int roomNumber) {
        driver.findElement(By.xpath(OCCUPANCY_CONFIG_XPATH)).click();
        WebElement room = driver.findElement(By.xpath(ROOMS_XPATH));
        while (roomNumber > 1) {
            room.click();
            roomNumber--;
        }
        driver.findElement(By.xpath(OCCUPANCY_CONFIG_XPATH)).click();
    }

    public void clickSubmit() {
        driver.findElement(By.xpath(SUBMIT_BUTTON_XPATH)).click();
    }

    public void refuseLogIn() {
        driver.findElement(By.xpath(HIDE_BUTTON_XPATH)).click();
    }

    public String getCurrencyTooltipValue() {
        WebElement currencyIcon = driver.findElement(By.xpath(CURRENCY_PICKER_XPATH));
        Actions make = new Actions(driver);
        make.moveToElement(currencyIcon).perform();

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
