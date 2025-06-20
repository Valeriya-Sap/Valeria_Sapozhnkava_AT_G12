package homework.log4j2.taf.pages.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import homework.log4j2.taf.driver.Driver;

import java.time.Duration;

public class BookingResultsPage {
    private static final Logger LOGGER = LogManager.getLogger(BookingResultsPage.class);
    WebDriver driver = Driver.getDriver();

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
        driver.findElement(By.xpath(HIDE_BUTTON_XPATH)).click();
        LOGGER.trace("Click 'Скрыть меню входа в аккаунт.' xpath {}", HIDE_BUTTON_XPATH);
    }

    public void sortByRatingAsc() {
        driver.findElement(By.xpath(SORT_BUTTON_XPATH)).click();
        LOGGER.trace("Click sort button xpath {}", SORT_BUTTON_XPATH);
        driver.findElement(By.xpath(RATING_ASC_XPATH)).click();
        LOGGER.trace("Click 'Оценка объекта (по возрастанию)' xpath{}", RATING_ASC_XPATH);
    }

    public void filterByRatingFive() {
        driver.findElement(By.xpath(RATING_FIVE_XPATH)).click();
        LOGGER.trace("Check checkbox 5 stars xpath {}", RATING_ASC_XPATH);
    }

    public void filterByNinePlus() {
        driver.findElement(By.xpath(RATING_NINE_PLUS_XPATH)).click();
        LOGGER.trace("Check checkbox 9+ stars xpath {}", RATING_NINE_PLUS_XPATH);
    }

    public String getFirstHotelRating() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        String firstHotelRating = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIRST_HOTEL_RATING_XPATH)))
                .getAttribute("aria-label");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LOGGER.trace("Get rating from first hotel {}", FIRST_HOTEL_RATING_XPATH);
        return firstHotelRating;
    }

    public void openFirstHotel() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIRST_HOTEL_TITLE_XPATH)))
                .click();
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LOGGER.trace("Open first hotel {}", FIRST_HOTEL_TITLE_XPATH);
    }

    public void scrollToTenHotel() {
        WebElement tenHotel = driver.findElement(By.xpath(TENTH_HOTEL_XPATH));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", tenHotel);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(TENTH_HOTEL_XPATH)))
                .click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LOGGER.trace("Scroll to the tenth hotel {}", TENTH_HOTEL_XPATH);
    }

    public void beautifyPage() {
        WebElement tenHotel = driver.findElement(By.xpath(TENTH_HOTEL_XPATH));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green';", tenHotel);
        WebElement hotelTitle = tenHotel.findElement(By.cssSelector("div[data-testid='title']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red';", hotelTitle);
        LOGGER.trace("Beatify the hotel");
    }

}
