package base;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop = new Properties();

    public  void setUp() throws IOException {

        if(driver==null)
        {
            InputStream file = getClass().getClassLoader().getResourceAsStream("configfiles/config.properties");
//           FileReader fr = new FileReader("C:\\Users\\aashma.lamichhane\\Desktop\\Automation_Self\\ForeveryngApp\\src\\test\\resourcess\\configfiles\\config.properties");
//            FileReader fr = new FileReader(file);
            prop.load(file);
        }

        String browserName = prop.getProperty("browser");

        if(browserName.equalsIgnoreCase("chrome"))
        {
             driver = new ChromeDriver();
             driver.get(prop.getProperty("testurl"));
             driver.manage().window().maximize();

        }

        else if(browserName.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
            driver.get(prop.getProperty("testurl"));
            driver.manage().window().maximize();

        }

        else if(browserName.equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();
            driver.get(prop.getProperty("testurl"));
            driver.manage().window().maximize();

        }

    }
    public void tearDown()
    {
        driver.close();
        System.out.println("Ok closed");
    }
}
