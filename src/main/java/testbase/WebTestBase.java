package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {
    public static WebDriver driver;
    public static Properties prop;
    public WebTestBase()  {
        try{
            prop=new Properties();
            FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/properties/config.properties/");
            prop.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void initialization(){
        String browserName=prop.getProperty("browser");
            if(browserName.equals("chrome")){
                System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
                driver=new ChromeDriver();
            }else{
                System.out.println("please select correct browser name");
            }
            driver.navigate().to(prop.getProperty("url"));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.PAGE_LOAD_TIMEOUT));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.IMPLICITLY_WAIT));
            driver.manage().deleteAllCookies();

        }
}
