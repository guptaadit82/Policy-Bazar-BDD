package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.talkToExpert;
import utils.WebDriverHelper;

public class stepdefinition4 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    talkToExpert talk=new talkToExpert();

    @When("I perform functionality of newsroom navigation module")
    public void i_perform_functionality_of_newsroom_navigation_module() throws IOException {
        test=hooks.report.createTest("talkToExpert");
    	talk.fetchProducts(test);
    }
    @When("navigate to policy bazar products & click on ULIPs box")
    public void navigate_to_policy_bazar_products_click_on_uli_ps_box() throws IOException {
        talk.ulipsBox(test);
    }
    @When("click on talk to experts")
    public void click_on_talk_to_experts() throws IOException {
       talk.takeScreen(test);
    }
    @Then("click on NRI number hyperlink & dismiss the alert")
    public void click_on_nri_number_hyperlink_dismiss_the_alert() throws IOException {
        talk.verifyText(test);
    }
	
}
