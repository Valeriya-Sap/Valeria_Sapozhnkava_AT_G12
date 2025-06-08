package day16_27_may;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WeatherMinsk {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        //driver.findElement(By.xpath("//div[text()='Принять все']/..")).click();
        driver.findElement(By.name("q")).sendKeys("погода минск");
        Thread.sleep(500L);
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
        //найти следующий день
        String tomorrow = DayOfWeekMyVersion.getDayOfWeekNextYear(0);
        String weatherTomorrow;
        weatherTomorrow = driver.findElement(By.xpath("//*[contains(@aria-label, 'Celsius " + tomorrow + " 12:00')][1]"))
                .getAttribute("aria-label");
        System.out.println(weatherTomorrow);
        //driver.findElement(By.cssSelector("text[aria-label*='Celsius среда 12:00']")
    }
}
