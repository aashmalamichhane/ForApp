// USING DATA

package testcases.Login;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login extends BaseTest {

    @Test(dataProvider = "logindata")
    public static void LoginTest(String usernmae, String password) throws IOException {

        Login test = new Login();
        test.setUp();
        driver.findElement(By.xpath("//a//h2")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(usernmae);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

//        boolean isErrorMsgDisplayed = false;
//        try {
//            WebElement errmsg = driver.findElement(By.xpath("//div[@class=\"error-message ng-star-inserted\"]"));
//            isErrorMsgDisplayed = errmsg.isDisplayed();
//        }
//        catch (Exception e)
//        {
//            isErrorMsgDisplayed = false;
//        }
//        if (expectedFAIL) {
//            Assert.assertTrue(isErrorMsgDisplayed, "Expected error message to be displayed, but it was not.");
//            System.out.println("Credential did not match as expected.");
//        } else {
//            Assert.assertFalse(isErrorMsgDisplayed, "Did not expect error message to be displayed, but it was.");
//            System.out.println("Credential matched successfully.");

    }


    @DataProvider(name = "logindata")
     public Object[][] tData()
     {
         return new Object[][]
                 {
                         {"Test123@yopmail.com" , "Test@123"},
                         {"Test123@yopmSail.com" , "Test@123"},
                         {"Test123@yopmaiSl.com" , "Test@12SS3"}

                 };
     }

}

