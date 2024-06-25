package base;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
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
//            InputStream file = getClass().getClassLoader().getResourceAsStream("configfiles/config.properties");
//            prop.load(file);

            FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles/config.properties");
            prop.load(fr);
        }

        String browserName = prop.getProperty("browser");

        if(browserName.equalsIgnoreCase("chrome"))
        {
             driver = new ChromeDriver();
             driver.get(prop.getProperty("testurl"));
             driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        }

        else if(browserName.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
            driver.get(prop.getProperty("testurl"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        }

        else if(browserName.equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();
            driver.get(prop.getProperty("testurl"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        }

    }
    public void tearDown()
    {
        driver.close();
        System.out.println("Ok closed");
    }
}
