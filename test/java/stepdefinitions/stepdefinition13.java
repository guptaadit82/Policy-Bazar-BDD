package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.goldRateFdCalculator;
import utils.WebDriverHelper;

public class stepdefinition13 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    goldRateFdCalculator gold= new goldRateFdCalculator();
	@When("navigate to GOLD RATE page")
	public void navigate_to_gold_rate_page() throws IOException {
		test=hooks.report.createTest("goldRateFdCalculator");
		gold.goldPage(test);
	}
	@When("choose required city as Lucknow")
	public void choose_required_city_as_lucknow() throws IOException {
		gold.takeScreen(test);
	  
	}
	@When("choose required state as Uttar Pradesh")
	public void choose_required_state_as_uttar_pradesh() throws IOException {
		gold.fetchGoldRate(test);
	    
	}
	@When("choose state as Delhi & nearest city as Delhi")
	public void choose_state_as_delhi_nearest_city_as_delhi() throws IOException {
	    gold.VerifyText(test);
	}
	@Then("click on submit button now")
	public void click_on_submit_button_now() throws IOException {
		gold.calculateRate(test);
	    
	}
}
