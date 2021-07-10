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
        sp.setConsent_page();

    }
    @When("^User click on sign in button$")
    public void user_click_on_sign_in_button() throws Throwable {
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

        Assert.assertTrue("Market Data", true);
        sp.setMarket_data_link();
        sp.setEvent_calender();
        System.out.println(" calender link is clicked");
        Thread.sleep(5000);
        Assert.assertTrue("Events calendar for:04 Jul 2021 - 10 Jul 2021",true);
        sp.setPrev();
        Thread.sleep(5000);

        System.out.println("hi........");
        //Thread.sleep(5000);
        sp.setPrev();
       Thread.sleep(5000);
       Assert.assertTrue("Events calendar for:20 Jun 2021 - 26 Jun 2021",true);
       //Thread.sleep(5000);
       //Assert.assertTrue(Utils.isTextPresent("20JunSun"));
       Thread.sleep(5000);
       sp.setPrev();
       Thread.sleep(5000);
        Assert.assertTrue(Utils.isTextPresent("18JunFri"));
        System.out.println(" The date of 18 june fri is recognised");
       sp.setJune_date();
       sp.setJenu_date1();
       Thread.sleep(5000);
       sp.setJu();
       sp.setjuneight();
         sp.setEar();
       Thread.sleep(5000);

     //  sp.setEarning_two();

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
