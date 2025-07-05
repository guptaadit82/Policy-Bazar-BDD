package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.covidWebinar;
import utils.WebDriverHelper;

public class stepdefinition2 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    covidWebinar covid=new covidWebinar();
    @When("I access newroom page & access decoding insurance menu")
    public void i_access_newroom_page_access_decoding_insurance_menu() {
    	test=hooks.report.createTest("covidWebinar");
        covid.fetchCovidPage(test);
    }
    @When("navigate to covid19 webinar & fill email as {string}")
    public void navigate_to_covid19_webinar_fill_email_as(String string) {
       covid.subscription(test, string);
    }
    @When("navigate to webinar contents")
    public void navigate_to_webinar_contents() {
    	covid.takeScreen(test);
        
    }
    @Then("click on submit button to get newsletter subscription")
    public void click_on_submit_button_to_get_newsletter_subscription() {
        covid.VerifyText(test);
    }

}
