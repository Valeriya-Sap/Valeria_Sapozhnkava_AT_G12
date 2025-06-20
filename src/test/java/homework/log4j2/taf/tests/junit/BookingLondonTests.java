package homework.log4j2.taf.tests.junit;

import homework.log4j2.taf.base.postcondition.JUnitConditions;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import homework.taf.driver.Driver;
import homework.log4j2.taf.pages.booking.BookingResultsPage;
import homework.log4j2.taf.pages.booking.BookingSearchPage;

import java.io.File;
import java.io.IOException;

public class BookingLondonTests extends JUnitConditions {
    private static final Logger LOGGER = LogManager.getLogger(BookingLondonTests.class);

    @Test
    public void testLondon() throws IOException {
        BookingSearchPage searchPage = new BookingSearchPage();
        BookingResultsPage resultsPage = new BookingResultsPage();
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        searchPage.enterCity("London");
        searchPage.enterAdultsNumber(2);
        searchPage.enterRoomNumber(1);
        searchPage.clickSubmit();
        resultsPage.scrollToTenHotel();
        resultsPage.beautifyPage();
//      5. Сделать скриншот
        File asFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        File directory = new File("screenshorts/booking_London.png");
        FileUtils.copyFile(asFile, directory);
        LOGGER.debug("Test passed");
    }
}
