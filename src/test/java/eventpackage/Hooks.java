package eventpackage;

import cucumber.api.java.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver driver;
    @Before
    public void setUp() throws Throwable
    {
        new Browser_Factory().openBrowser();
        System.out.println("I am starting pre condition checks......");
        //Assert.assertTrue("Checking the welcome message shown",
       // driver.findElement(By.xpath("/html/body/header/div/div[2]/div/div/div[1]/div[1]/h1/a/img")).isDisplayed());

    }
    public void tearDown()
                {
                    System.out.println(" Post condition checks.....");
        new Browser_Factory().closeBrowser();
    }
}
