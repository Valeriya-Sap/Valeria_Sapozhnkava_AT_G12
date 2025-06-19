package homework.taf.steps.cucumber;

import homework.taf.driver.Driver;
import homework.taf.pages.booking.BookingResultsPage;
import homework.taf.pages.booking.BookingSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class BookingLondonSteps {

    BookingSearchPage searchPage = new BookingSearchPage();
    BookingResultsPage resultsPage = new BookingResultsPage();

    @Given("I open a site London")
    public void openSite() {
        searchPage.openBooking();
        searchPage.acceptCookies();
        searchPage.refuseLogIn();
    }
    @When("I fill the search form London")
    public void fillSearch() {
        searchPage.enterCity("London");
        searchPage.enterAdultsNumber(2);
        searchPage.enterRoomNumber(1);
        searchPage.clickSubmit();
    }
    @Then("I verify the screenshot")
    public void verifyResult() throws IOException {
        resultsPage.scrollToTenHotel();
        resultsPage.beautifyPage();
        //      5. Сделать скриншот
        File asFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        File directory = new File("screenshorts/booking_London.png");
        FileUtils.copyFile(asFile, directory);
    }
}
