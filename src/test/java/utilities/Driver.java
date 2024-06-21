package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    public WebDriver Driver()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.foreveryng.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public  static void main (String args[])
    {
        Driver D1  =new Driver();
    }

}
