package eventpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends Browser_Factory{

    //Method to check the expected text is presented or not
    public static boolean isTextPresent(String text)
    {
        return driver.findElement(By.tagName("body")).getText().contains(text);
    }
    //Method to check the element is present or not
    public static boolean isELementPresent(By element)
    {
        try{
            return driver.findElement(element).isDisplayed();
        }
        catch(Exception e)
        {
            System.out.println("cannot  find the element");
            return false;
        }
    }

    //Method to wait for a particular element
    public static void waitForElement(By element, int time)
    {
        WebDriverWait w=new WebDriverWait(driver,time);
        try {
            w.wait();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        w.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }
    public static void waitForElementToBeClickable(By by)
    {
        System.out.println("Waiting for element to be clickable" +by);
       // WebDriverWait webDriverWait=new WebDriverWait(Browser_Factory.driver(),MAX_TIMEOUT);
    }
  /*  public boolean waitUntilClickable(By locator, int timeoutSeconds) {
        boolean clickable = false;
        WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        clickable = true;
        capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return clickable;
    }*/
    public static void waitForElementToBeClickableAndClick(By by)
    {
        waitForElementToBeClickable(by);
        Browser_Factory.driver.findElement(by).click();
    }
    public boolean waitUntilObjExist(By locator) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        return true;
    }
}
