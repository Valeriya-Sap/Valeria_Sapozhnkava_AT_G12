package day15_24_may;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");
    }
}
