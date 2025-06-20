package homework.log4j2.taf.steps.cucumber;

import homework.log4j2.taf.driver.Driver;
import homework.log4j2.taf.pages.booking.BookingResultsPage;
import homework.log4j2.taf.pages.booking.BookingSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class BookingLondonSteps {
    private static final Logger LOGGER = LogManager.getLogger(BookingLondonSteps.class);
    BookingSearchPage searchPage = new BookingSearchPage();
    BookingResultsPage resultsPage = new BookingResultsPage();

    @Given("I open a site London")
    public void openSite() {
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
        LOGGER.debug("Step Given is finished");
    }

    @When("I fill the search form London")
    public void fillSearch() {
        searchPage.enterCity("London");
        searchPage.enterAdultsNumber(2);
        searchPage.enterRoomNumber(1);
        searchPage.clickSubmit();
        LOGGER.debug("Step When is finished");
    }

    @Then("I verify the screenshot")
    public void verifyResult() throws IOException {
        resultsPage.scrollToTenHotel();
        resultsPage.beautifyPage();
        //      5. Сделать скриншот
        File asFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        File directory = new File("screenshorts/booking_London.png");
        FileUtils.copyFile(asFile, directory);
        LOGGER.debug("Step Then is finished");
    }
}
