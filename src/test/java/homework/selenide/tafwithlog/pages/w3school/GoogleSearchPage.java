package homework.selenide.tafwithlog.pages.w3school;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchPage {
    private static final Logger LOGGER = LogManager.getLogger(GoogleSearchPage.class);

    private static String ACCEPT_COOKIES_XPATH = "//div[text()='Принять все']/..";
    private static String SEARCH_NAME = "q";

    public GoogleSearchPage() {
    }

    public void openGoogleSearch() {
        open("https://google.com");
        LOGGER.trace("Google is opened.");
    }

    public void acceptCookies() {
        $x(ACCEPT_COOKIES_XPATH).click();
    }

    public void search() {
        WebElement search = $(By.name(SEARCH_NAME));
        search.click();
        search.sendKeys(Keys.chord(Keys.chord(Keys.CONTROL, "v"), Keys.ENTER));
        LOGGER.trace("Search performed");
    }

    public List<SelenideElement> takeAllTitles() {
        List<SelenideElement> resultTitles = $$x("//h3")
                .stream().collect(Collectors.toList());
        LOGGER.trace("Save title list.");
        return resultTitles;
    }

}

