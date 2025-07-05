package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.nationalPensionScheme;
import utils.WebDriverHelper;

public class stepdefinition11 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    nationalPensionScheme nps=new nationalPensionScheme();
	@When("navigate to National Pension Scheme")
	public void navigate_to_national_pension_scheme() {
		test=hooks.report.createTest("nationalPensionScheme");
	}
	@When("go to NPS Calculator")
	public void go_to_nps_calculator() throws IOException {
		nps.fetchSiteMap(test);
	    
	}
	@When("Enter your age as {string} & Enter your monthly expense as {string} & Enter your pension age as {string}")
	public void enter_your_age_as_enter_your_monthly_expense_as_enter_your_pension_age_as(String string, String string2, String string3) throws IOException {
	   nps.fillForm(test,string ,string2,string3);
	}
	@When("Select your extra Details")
	public void select_your_extra_details() throws IOException {
	    nps.verifyText(test);
	}
	
	@Then("click calculate")
	public void click_calculate() throws IOException {
		nps.takeScreen(test);
	    
	}
}
