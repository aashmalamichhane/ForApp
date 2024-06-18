package OrderPlace;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrderSunscreen {

    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.foreveryng.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a//h2")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Test123@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();

        //search for product
        WebElement searchbox = driver.findElement(By.id("search"));
        searchbox.click();
        WebElement searchbox2 = driver.findElement(By.xpath("//div[@class=\"autosearch_form_fields\"]"));
//        searchbox2.sendKeys("Sunscreen");
//        searchbox2.sendKeys(Keys.ENTER);

    }
}
