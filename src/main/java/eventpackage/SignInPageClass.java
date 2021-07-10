package eventpackage;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignInPageClass extends Browser_Factory {
    WebDriver driver;

    public SignInPageClass() {
    }

    @FindBy(className = "btn.primary")
    WebElement cookeies;
    @FindBy(linkText = "Sign in")
    WebElement Sign_in_button;
    //username
    @FindBy(id = "login-username")
    WebElement user_name;
    //password
    @FindBy(id = "login-passwd")
    WebElement pass_word;
    //Next
    @FindBy(id = "login-signin")
    WebElement next_button;
    //Signin
    @FindBy(id = "login-signin")
    WebElement logging_in;
    //Sing_out
    @FindBy(id = "uh-signedout")
    WebElement sign_out;
    //Finance
    @FindBy(linkText = "Finance")
    WebElement Finance_Link;
    //Logo
    @FindBy(id = "uh-logo")
    WebElement Fin_yaho_logo;
    //Market data
    @FindBy(xpath = "//*[contains(text(),'Market Data')]")
    WebElement market_data_link;
    //calender
    @FindBy(xpath = "//*[contains(text(),'Calendar')]")
    WebElement event_calender;
    //June13-19 label
    @FindBy(xpath = "//*[@id=fin-cal-events]/div[1]")
    WebElement cal_event_13_19;
    //consent_page cookies
    @FindBy(css = "button.btn.primary")
    WebElement consent_page;
    //Previous
    @FindBy(xpath = "//*[contains(text(),'Prev')]")
    WebElement prev;
   @FindBy(xpath = "//*[@id='fin-cal-events']/div[2]/ul/li[6]/div/span[1]")
    WebElement june_date;
    @FindBy(xpath = "//*[@id='fin-cal-events']/div[2]/ul/li[6]/div/span/span")
    WebElement jenu_date1;
    @FindBy(id = "uh-profile")
    WebElement abc;
    @FindBy(partialLinkText = "Earnings")
    WebElement juneeighteen;
    @FindBy(xpath = "//div[@id=fin-cal-events]/div[2]/ul/li[6]/a[1]")
    WebElement earning_two;
    @FindBy(xpath = "//div[@id=fin-cal-events]/div[2]/ul/li[6]/a[2]")
    WebElement stock_splits;
    @FindBy(xpath = "//div[@id=fin-cal-events]/div[2]/ul/li[6]/a[3]")
    WebElement IPO_pricing;
    @FindBy(xpath = "//div[@id=fin-cal-events]/div[2]/ul/li[6]/a[4]")
    WebElement Economic_ev;

    @FindBy(xpath = "//*[@id=\"fin-cal-events\"]/div[2]/ul/li[6]/div")
    WebElement juneight;
    // selecting june list
    @FindBy(xpath = "//*[@id=\"fin-cal-events\"]/div[2]/ul/li[6]/div")
    WebElement ju;
    // reading all the event calender list on 18th june
    @FindBy(xpath = "//*[@id=\"fin-cal-events\"]/div[2]/ul/li[6]")
    WebElement all;

    public void setSign_in() {
        Sign_in_button.click();
    }

    public void setUser_name(String username) {
        user_name.sendKeys(username);
    }

    public void setPass_word(String password) {
        pass_word.sendKeys(password);
    }

    public void setNext_button() {
        next_button.click();
    }

    public void setLogging_in() {
        logging_in.click();
    }

    public void setCookeies() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", cookeies);
        js.executeScript("arguments[0].click();", cookeies);
    }

    public void setFinance_Link() {
        Finance_Link.click();
    }

    public void setFin_yaho_logo() {
        Fin_yaho_logo.isDisplayed();
    }

    public void setMarket_data_link() {
        market_data_link.click();
    }

    public void setEvent_calender() {
        event_calender.click();
    }

    public void setSign_out() {
        sign_out.click();
    }

    public void setConsent_page() throws InterruptedException {
        consent_page.click();
        Thread.sleep(5000);
    }
    public void setAbc() {
        abc.click();
    }

    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    public void setPrev() {
        prev.click();
    }

    public void setJune_date() {      // june_date.isDisplayed();
        june_date.getText();
        System.out.println("hello");
    }
    public void setJenu_date1() {
        System.out.println("show" +

                jenu_date1.getText());
    }

    public void setJu() {
        System.out.println("........." + ju.getText());
    }

    public void setjuneight() {
        juneight.getText();
    }

    public void setEar() {
        System.out.println("setEarn");
        {
            System.out.println(all.getText());
        }
    }
    public void setJuneeighteen()
    {
        juneeighteen.getText();
    }
    public void setEarning_two() throws InterruptedException {
        System.out.println(" it selected 2 earnings rows");
                System.out.println(" is selected");
        earning_two.getText();
    }

}
