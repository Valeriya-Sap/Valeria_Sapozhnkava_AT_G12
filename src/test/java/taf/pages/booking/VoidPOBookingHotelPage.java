package taf.pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import taf.driver.Driver;

import java.time.Duration;

public class VoidPOBookingHotelPage {
    WebDriver driver = Driver.getDriver();

    private static String RATING_XPATH = "//div[@data-testid='review-score-right-component']/div[2]";

    public VoidPOBookingHotelPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public double getHotelRating() {
        String score = driver.findElement(By.xpath(RATING_XPATH))
                .getText();
        double number = Double.parseDouble(score);
        return number;
    }
}
