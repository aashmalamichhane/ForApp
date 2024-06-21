package testcases.OrderPlace;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class OrderSunscreen {

    public static void main(String args[]) throws InterruptedException {

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
        Thread.sleep(2000);
        WebElement searchbox2 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-navbar[1]/header[1]/div[1]/div[1]/div[1]/div[1]/app-auto-search[1]/form[1]/div[1]/input[1]"));
        searchbox2.sendKeys("Sunscreen");
        searchbox2.sendKeys(Keys.ENTER);

        //Check if  product exist after search
        String expProduct = "Aqualogica Radiance+ Dewy Sunscreen";
        List<WebElement> proList = driver.findElements(By.xpath("//h2[@tabindex='0']"));

        boolean productFound = false;
        for (WebElement eachitem : proList) {
            if (eachitem.getText().equals(expProduct)) {
                System.out.println(eachitem.getText());
                eachitem.click();
                driver.findElement(By.xpath("//button[normalize-space()=\"Add to Cart\"]")).click();
                productFound = true;

                //Check if added with assertion
                String expAssert = "Item added to cart.";
                WebElement assertBox = driver.findElement(By.xpath("//div[@class=\"message-text\"]"));
                String actAssert = assertBox. getText();

                if(expAssert.equals(actAssert))
                {
                    System.out.println("Test Passed : Item is added to cart");
                }
                break;
            }
        }
            if(!productFound) {
                System.out.println("Product Does not exist");
            }

        }
    }

