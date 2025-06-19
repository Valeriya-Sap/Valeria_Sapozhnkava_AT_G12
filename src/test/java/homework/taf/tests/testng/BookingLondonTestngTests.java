package homework.taf.tests.testng;

import homework.taf.base.postcondition.TestNGPostcondition;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import homework.taf.driver.Driver;
import homework.taf.pages.booking.BookingResultsPage;
import homework.taf.pages.booking.BookingSearchPage;

import java.io.File;
import java.io.IOException;

public class BookingLondonTestngTests extends TestNGPostcondition {
    @Test
    public void testLondon() throws IOException {
        BookingSearchPage searchPage = new BookingSearchPage();
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        searchPage.enterCity("London");
        searchPage.enterAdultsNumber(2);
        searchPage.enterRoomNumber(1);
        searchPage.clickSubmit();

        BookingResultsPage resultsPage = new BookingResultsPage();
        resultsPage.scrollToTenHotel();
        resultsPage.beautifyPage();
//      5. Сделать скриншот
        File asFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        File directory = new File("screenshorts/booking_London.png");
        FileUtils.copyFile(asFile, directory);
    }
}
