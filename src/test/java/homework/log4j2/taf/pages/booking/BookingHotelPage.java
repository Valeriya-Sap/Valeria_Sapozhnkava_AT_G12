package homework.log4j2.taf.pages.booking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import homework.log4j2.taf.driver.Driver;

import java.time.Duration;

public class BookingHotelPage {
    private static final Logger LOGGER = LogManager.getLogger(BookingHotelPage.class);
    WebDriver driver = Driver.getDriver();

    private static String RATING_XPATH = "//div[@data-testid='review-score-right-component']/div[2]";

    public BookingHotelPage() {}

    public double getHotelRating() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        String score = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RATING_XPATH)))
                .getText();
        double number = Double.parseDouble(score.replace(",", "."));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LOGGER.trace("Get rating from first hotel {}", RATING_XPATH);
        return number;
    }

}
