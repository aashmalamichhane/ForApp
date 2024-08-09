package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    public static void main(String args[]) throws IOException {
        FileReader fro = new File(System.getProperty("user.dir")+"\\src\\test\\resourcess\\configfiles\\config.properties");
        Properties p = new Properties();
        p.load(fro);

        System.out.println(p.getProperty("testurl"));
        System.out.println(p.getProperty("browser"));
    }
}
