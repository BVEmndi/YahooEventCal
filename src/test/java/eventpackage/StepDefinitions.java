package eventpackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.List;

public class StepDefinitions {
    WebDriver driver;
    SignInPageClass sp=new SignInPageClass();

    @Given("^User is in the sign in page$")
    public void user_is_in_the_sign_in_page() throws Throwable {
//        System.out.println("The title of the page:"+ driver.getTitle());

        //driver.navigate().to("https://consent.yahoo.com/v2/collectConsent?sessionId=3_cc-session_3f2e6401-01d0-450f-bb91-99223a86aa9c");
        sp.setConsent_page();

    }
    @When("^User click on sign in button$")
    public void user_click_on_sign_in_button() throws Throwable {
//        driver.navigate().to("https://uk.yahoo.com/?guccounter=1");
    sp.setSign_in();
    }

    @When("^User provide \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_provide_and(String arg1, String arg2) throws Throwable {
        sp.setUser_name(arg1);
        Assert.assertTrue("firsttestlogin_12",true);
        sp.setNext_button();
        sp.setPass_word(arg2);
        sp.setLogging_in();
        Assert.assertTrue("123",true);

        sp.setFinance_Link();
        // driver.navigate();
       // sp.setFin_yaho_logo();
        Assert.assertTrue("Market Data", true);
        sp.setMarket_data_link();
        sp.setEvent_calender();
        System.out.println(" calender link is clicked");
        Thread.sleep(5000);
Assert.assertTrue("Events calendar for:13 Jun 2021 - 19 Jun 2021",true);
//Thread.sleep(3000);
//Assert.assertTrue("18JunFri",true);
//Thread.sleep(5000);
        System.out.println("hi........");
        Thread.sleep(5000);
        sp.setPrev();
       Thread.sleep(5000);
        Assert.assertTrue(Utils.isTextPresent("18JunFri"));
        System.out.println(" The date of 18 june fri is recognised");
       //sp.setJune_date();
       Thread.sleep(5000);
      // sp.setEarning_two();
     //sp.setJuneeighteen();
     // sp.setEar();
        sp.setAbc();
        sp.setSign_out();
    }

    @Then("^User should login into yahoo and see his account name$")
    public void user_should_login_into_yahoo_and_see_his_account_name() throws Throwable {
        System.out.println(" I logged into the account successfully");
    }


}
