package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {

    public static void  main (String args[]){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.foreveryng.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a//h2")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Test123@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();

    }
}
