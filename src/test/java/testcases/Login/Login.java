package testcases.Login;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.time.Duration;

public class Login extends BaseTest {

    public static void main(String args[]) throws IOException {

            Login test =  new Login();
            test.setUp();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//a//h2")).click();
            driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Test123@yopmail.com");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();


        }

}

