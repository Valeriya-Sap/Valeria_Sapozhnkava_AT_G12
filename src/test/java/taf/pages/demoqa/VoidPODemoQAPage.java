package taf.pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import taf.driver.Driver;

import java.time.Duration;

public class VoidPODemoQAPage {
    WebDriver driver = Driver.getDriver();

    private static String SELECT_OPTION_XPATH = "//div[text()='Select Option']";
    private static String GROUP1_OPTION1_XPATH = "//div[text()='Group 1, option 1']";
    private static String SELECT_TITLE_XPATH = "//div[text()='Select Title']";
    private static String OPTION_DR_XPATH = "//div[text()='Dr.']";
    private static String SELECT_MENU_XPATH = "//div[@id='selectMenuContainer']/div[6]";
    private static String OPTION_BLACK_XPATH = "//*[text()='Black']";
    private static String SELECT_MULTISELECT_XPATH = "//div[text()='Select...']";
    private static String OPTION_GREEN_XPATH = "//div[text()='Green']";
    private static String OPTION_VOLVO_XPATH = "//*[text()='Volvo']";

    public VoidPODemoQAPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void openDemoQA() {
        driver.get("https://demoqa.com/select-menu");
    }

    public void selectOption() {
        driver.findElement(By.xpath(SELECT_OPTION_XPATH)).click();
        driver.findElement(By.xpath(GROUP1_OPTION1_XPATH)).click();
    }

    public void selectTitle() {
        driver.findElement(By.xpath(SELECT_TITLE_XPATH)).click();
        driver.findElement(By.xpath(OPTION_DR_XPATH)).click();
    }

    public void selectMenu() {
        driver.findElement(By.xpath(SELECT_MENU_XPATH)).click();
        driver.findElement(By.xpath(OPTION_BLACK_XPATH)).click();
    }

    public void selectMultiselect() {
        driver.findElement(By.xpath(SELECT_MULTISELECT_XPATH)).click();
        driver.findElement(By.xpath(OPTION_GREEN_XPATH)).click();
    }

    public void selectStandardMultiselect() {
        driver.findElement(By.xpath(OPTION_VOLVO_XPATH)).click();
    }
}
