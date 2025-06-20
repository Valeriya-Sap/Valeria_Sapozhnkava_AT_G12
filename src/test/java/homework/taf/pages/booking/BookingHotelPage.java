package homework.taf.pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import homework.taf.driver.Driver;

import java.time.Duration;

public class BookingHotelPage {
    WebDriver driver = Driver.getDriver();

    private static String RATING_XPATH = "//div[@data-testid='review-score-right-component']/div[2]";

    public BookingHotelPage() {

    }

    public double getHotelRating() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        String score = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RATING_XPATH)))
                .getText();
        double number = Double.parseDouble(score.replace(",", "."));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return number;
    }

}
