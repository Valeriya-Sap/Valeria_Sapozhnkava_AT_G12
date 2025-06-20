package homework.selenide.tafwithlog.pages.w3school;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class W3SchoolPage {
    private static final Logger LOGGER = LogManager.getLogger(W3SchoolPage.class);
    private static String ACCEPT_COOKIES_XPATH = "//div[@id='accept-choices']";
    private static String TUTORIAL_TITLE_XPATH = "//h1/span[text()='Tutorial']";

    public W3SchoolPage() {
    }

    public void openW3SchoolPage() {
        open("https://www.w3schools.com/java/");
        LOGGER.trace("W3schools is opened.");
    }

    public void acceptCookies() {
        $x(ACCEPT_COOKIES_XPATH).click();
        LOGGER.trace("Accept cookies.");
    }

    public void copyTitle() {
        SelenideElement tutorial = $x(TUTORIAL_TITLE_XPATH);
        tutorial.doubleClick();
        tutorial.sendKeys(Keys.chord(Keys.CONTROL, "c"));
        LOGGER.trace("Title is copied.");
    }

}