package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.unionBankFdCalculator;
import utils.WebDriverHelper;

public class stepdefinition12 {
	unionBankFdCalculator ubi=new unionBankFdCalculator();
	public static ExtentTest test;
    public WebDriverHelper helper;
	@When("navigate to FD banks")
	public void navigate_to_fd_banks() {
		test=hooks.report.createTest("unionBankFdCalculator");

	}

	@When("choose Union Bank FD calculator")
	public void choose_union_bank_fd_calculator() throws IOException {
		ubi.fdBanks(test);

	}

	@When("Enter total Investment value {string} & ROI as {string} & Timeperiod as {string}")
	public void enter_total_investment_value_roi_as_timeperiod_as(String string, String string2, String string3) throws IOException {
	    ubi.fillForm(test,string,string2,string3);
	}

	@When("Time period values in time period input box")
	public void time_period_values_in_time_period_input_box() throws IOException {
		ubi.verifyText(test);
	}

	@Then("click on calculate button")
	public void click_on_calculate_button() throws IOException {
		ubi.takeScreen(test);

	}

}
