package homework.selenide.tafwithlog.pages.booking;

import com.codeborne.selenide.Condition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class BookingHotelPage {
    private static final Logger LOGGER = LogManager.getLogger(BookingHotelPage.class);

    private static String RATING_XPATH = "//div[@data-testid='review-score-right-component']/div[2]";

    public BookingHotelPage() {
    }

    public double getHotelRating() {
        String score = $x(RATING_XPATH).shouldBe(Condition.visible, Duration.ofSeconds(10)).getText();
        double number = Double.parseDouble(score.replace(",", "."));
        LOGGER.trace("Get rating from first hotel {}", RATING_XPATH);
        return number;
    }

}
