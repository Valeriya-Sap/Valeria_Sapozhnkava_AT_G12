package taf.tests.testng;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import taf.driver.Driver;
import taf.pages.booking.VoidPOBookingResultsPage;
import taf.pages.booking.VoidPOBookingSearchPage;

import java.io.File;
import java.io.IOException;

public class BookingLondonTestngTests {
    @Test
    public void testLondon() throws IOException {
        VoidPOBookingSearchPage searchPage = new VoidPOBookingSearchPage();
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        searchPage.enterCity("London");
        searchPage.enterAdultsNumber(2);
        searchPage.enterRoomNumber(1);
        searchPage.clickSubmit();

        VoidPOBookingResultsPage resultsPage = new VoidPOBookingResultsPage();
        resultsPage.scrollToTenHotel();
        resultsPage.beautifyPage();
//      5. Сделать скриншот
        File asFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        File directory = new File("screenshorts/booking_London.png");
        FileUtils.copyFile(asFile, directory);
    }
}
