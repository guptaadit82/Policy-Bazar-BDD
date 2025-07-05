package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.postalInsurance;
import utils.WebDriverHelper;

public class stepdefinition10 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    postalInsurance postal =new postalInsurance();
	@When("I perform functionality of Sitemap module")
	public void i_perform_functionality_of_sitemap_module() {
		test=hooks.report.createTest("postalInsurance");
	}
	@When("navigate to Postal Life Insurance")
	public void navigate_to_postal_life_insurance() throws IOException {
	    postal.fetchSiteMap(test);
	}
	@When("choose first plan& write your name as {string} dob as {string} mobile as {string}")
	public void choose_first_plan_write_your_name_as_dob_as_mobile_as(String string, String string2, String string3) throws IOException {
	    postal.fillForm(test,string,string2,string3);
	}
	@When("analyse the plan to be choosen")
	public void analyse_the_plan_to_be_choosen() throws IOException {
		postal.verifyText(test);
	}
	
	@When("click on check  premium button")
	public void click_on_check_premium_button() throws IOException {
		postal.takeScreen(test);
	    
	}
	@Then("navigate back to previous page")
	public void navigate_back_to_previous_page() {
//		postal.verifyText(test);
	    
	}
}
