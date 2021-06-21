package eventpackage;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Browser_Factory {

    public static WebDriver driver;
    //org.apache.log4j.Logger logger= Logger.getLogger("Browser_Factory");
    public Browser_Factory()
    {
        PageFactory.initElements(driver, this);
    }
    public void openBrowser() throws Throwable {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vanim\\YahooEventCalender\\src\\test\\resources\\eventpackage\\config.properties");
        properties.load(fileInputStream);
        String URL = properties.getProperty("url");
        String BROWSER = properties.getProperty("browser");
        ChromeDriverManager.chromedriver().setup();
        if (BROWSER.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanim\\YahooEventCalender\\src\\test\\resources\\eventpackage\\chromedriver.exe");
            driver = new ChromeDriver();
            //logger.info("Chrome browser is opened");
        }
        else if (BROWSER.equals("Firefox"))
        {
            System.setProperty("webdriver.firefox.marionette", "C:\\Users\\vanim\\YahooEventCalender\\src\\test\\resources\\eventpackage\\geckodriver.exe");
            driver = new FirefoxDriver();
           // logger.info("firefox browser is opened");
        }
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("The Title of the application:" + driver.getTitle());
        //logger.info("the title is printed");
    }
    public void closeBrowser() {
       // System.out.println("the browser is closed");
        driver.quit();
    }
    }

