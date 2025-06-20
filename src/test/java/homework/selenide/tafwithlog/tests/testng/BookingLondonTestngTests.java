package homework.selenide.tafwithlog.tests.testng;

import homework.selenide.tafwithlog.base.postcondition.TestNGConditions;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import homework.selenide.tafwithlog.driver.Driver;
import homework.selenide.tafwithlog.pages.booking.BookingResultsPage;
import homework.selenide.tafwithlog.pages.booking.BookingSearchPage;

import java.io.File;
import java.io.IOException;

public class BookingLondonTestngTests extends TestNGConditions {
    private static final Logger LOGGER = LogManager.getLogger(BookingLondonTestngTests.class);

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
