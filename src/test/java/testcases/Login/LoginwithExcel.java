// USING DATA

package testcases.Login;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.ReadXLSData;

import java.io.IOException;

public class LoginwithExcel extends BaseTest {

    @Test(dataProviderClass = ReadXLSData.class,dataProvider="logexceldata")
    public static void LoginTest(String usernmae, String password) throws IOException {

        LoginwithExcel test = new LoginwithExcel();
        test.setUp();
        driver.findElement(By.xpath("//a//h2")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(usernmae);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();


    }



}

