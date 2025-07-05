package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.leaderShip;
import utils.WebDriverHelper;

public class stepdefinition3 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    leaderShip lead=new leaderShip();
    @When("I perform functionality of newsroom modules")
    public void i_perform_functionality_of_newsroom_modules() {
    	test=hooks.report.createTest("Leadership");
    }
	@When("navigate to leadership section")
	public void navigate_to_leadership_section() throws IOException {
		
		lead.nomineeDetails(test);
	   
	}
	@When("perform sorting operation as required")
	public void perform_sorting_operation_as_required() throws IOException {
		lead.findNominee(test);
	    
	}
	@When("try to add nominee")
	public void try_to_add_nominee() throws IOException {
		lead.takeScreen(test);
	 
	}
	@Then("click on submit button to get all results")
	public void click_on_submit_button_to_get_all_results() throws IOException {
		lead.VerifyText(test);
	  
	}
}
