package testcases.Registration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RegisterUser {

    public static void main (String args[]) throws InterruptedException {

//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //base

        driver.get("https://foreveryng.com/"); //properties file
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//span[normalize-space()=\"Sign in\"]")).click();
        driver.findElement(By.xpath("//a[normalize-space()=\"Register Here\"]")).click();
//        driver.close();

        driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]")).sendKeys("Test Test");
        driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("Test123@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder=\"Phone\"]")).sendKeys("9876543211");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Test@123");
        driver.findElement(By.xpath("//input[@placeholder=\"Confirm Password\"]")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[normalize-space()=\"Regiseter New Account\"]")).click();





    }
}
