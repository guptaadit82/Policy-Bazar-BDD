package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.silverRateFdCalculator;
import pages.specialStory;
import utils.WebDriverHelper;

public class stepdefinition14 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    silverRateFdCalculator silver=new silverRateFdCalculator();
	@When("navigate to SILVER RATE page")
	public void navigate_to_silver_rate_page() throws IOException {
		test=hooks.report.createTest("silverRateFdCalculator");
		silver.silverPage(test);
	    
	}
	@When("choose required city as Chennai")
	public void choose_required_city_as_chennai() throws IOException {
		silver.VerifyText(test);
	   
	}
	@When("choose required state Chennai")
	public void choose_required_state_chennai() throws IOException {
		silver.fetchSilverRate(test);
	    
	}
	@When("nearest city as Delhi")
	public void nearest_city_as_delhi() throws IOException {
		silver.takeScreen(test);
	    
	}
	@Then("click on submit buttonn")
	public void click_on_submit_buttonn() throws IOException {
		silver.calculateRate(test);
	    
	}
}
