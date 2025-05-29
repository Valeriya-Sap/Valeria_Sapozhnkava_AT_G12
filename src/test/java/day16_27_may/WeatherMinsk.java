package day16_27_may;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeatherMinsk {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.xpath("//div[text()='Принять все']/..")).click();
        driver.findElement(By.name ("q")).sendKeys("погода минск");
        Thread.sleep(500L);
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
//найти следующий день
        driver.findElement(By.xpath("//*[@aria-label='21°Celsius среда 12:00']"));
    }
}
