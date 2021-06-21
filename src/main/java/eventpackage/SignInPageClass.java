package eventpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignInPageClass extends Browser_Factory {
        WebDriver driver;
        public SignInPageClass()  {         }
        @FindBy(className="btn.primary")
        WebElement cookeies;
@FindBy(linkText="Sign in")
WebElement Sign_in_button;

//username
@FindBy(id="login-username")
WebElement user_name;
//password
@FindBy(id="login-passwd")
WebElement pass_word;
//Next
@FindBy(id="login-signin")
WebElement next_button;
//Signin
@FindBy(id="login-signin")
WebElement logging_in;
//Sing_out
@FindBy(id="uh-signedout")
WebElement sign_out;
//Finance
@FindBy(linkText = "Finance")
WebElement Finance_Link;
//Logo
@FindBy(id="uh-logo")
WebElement Fin_yaho_logo;
//Market data
@FindBy(xpath="//*[contains(text(),'Market Data')]")
WebElement market_data_link;
//calender
@FindBy(xpath="//*[contains(text(),'Calendar')]")
WebElement event_calender;
//June13-19 label
@FindBy(xpath = "//*[@id=fin-cal-events]/div[1]")
WebElement cal_event_13_19;
//consent_page cookies
@FindBy(css="button.btn.primary")
WebElement consent_page;
//Previous
@FindBy(xpath="//*[contains(text(),'Prev')]")
 WebElement prev;

//june 18 column list
@FindBy(xpath="//*[@data-reactid='136']")
//@FindBy(xpath="//*[@id=fin-cal-events]/div[2]/ul/li[6]/div")
WebElement june_date;
@FindBy(id="uh-profile")
WebElement abc;
@FindBy(partialLinkText = "Earnings")
//@FindBy(xpath="//*[@id=fin-cal-events]/div[2]/ul/li[6]/div/span[1]")
WebElement juneeighteen;
//2 earnings
@FindBy(xpath="//span[@id=fin-cal-events]/div[2]/ul/li[6]/a[1]")
// @FindBy(xpath = "//*[@data-reactid='100']")
//  @FindBy(xpath=" //span(contains@class,'Earnings'")
WebElement earning_two;

//        16 stock splits= //*[@id="fin-cal-events"]/div[2]/ul/li[6]/a[2]/span
//      13 IPO pricing =//*[@id="fin-cal-events"]/div[2]/ul/li[6]/a[3]
 //    41 Economic ev= //*[@id="fin-cal-events"]/div[2]/ul/li[6]/a[4]


 public void setSign_in()
 {
     Sign_in_button.click();
 }
public void setUser_name(String username)
{    user_name.sendKeys(username);}
public void setPass_word(String password)
{ pass_word.sendKeys(password);}
public void setNext_button()
{    next_button.click();
}
public void setLogging_in()
{
    logging_in.click();
}
public void setCookeies() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",cookeies);
        js.executeScript("arguments[0].click();", cookeies);
    }
public void setFinance_Link()
{
    Finance_Link.click();
}
public void setFin_yaho_logo()
{
    Fin_yaho_logo.isDisplayed();
}
public void setMarket_data_link()
{
  market_data_link.click();
}
public void setEvent_calender()
{
    event_calender.click();
}
public void setSign_out()
{
    sign_out.click();
}
public void setConsent_page() throws InterruptedException {
    consent_page.click();
    Thread.sleep(5000);
//    driver.switchTo().alert().accept();

}
public void setAbc()
{
    abc.click();
}

public String validateLoginPageTitle()
{
    return driver.getTitle();
}
public void setPrev()
{
    prev.click();
}
public void setJune_date()
{      // june_date.isDisplayed();
    june_date.getText();
    System.out.println("hello");
   }
/*public void setEar()
{
    {
        List<WebElement> objLinks=driver.findElements(By.xpath("//*[@id=fin-cal-events]/div[2]/ul/li[6]/div"));
        for(WebElement objCurrentLink : objLinks)
        {
            String StrLinkText= objCurrentLink.getText();
            System.out.println(StrLinkText);
        }
    }
}*/

    public void setJuneeighteen()
    {
        juneeighteen.getText();
    }
    public void setEarning_two()
    {
        System.out.println(" it selected 2 earnings rows");
        earning_two.getText();
    }

}
