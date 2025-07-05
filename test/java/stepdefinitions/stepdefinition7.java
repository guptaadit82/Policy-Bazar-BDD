package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.linkedInCareer;
import utils.WebDriverHelper;

public class stepdefinition7 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    linkedInCareer join=new linkedInCareer();
	@When("I perform functionality of career module")
	public void i_perform_functionality_of_career_module() {
		test=hooks.report.createTest("linkedInCareer");
		
	    
	}
	@When("navigate to JOIN our team")
	public void navigate_to_join_our_team() {
		join.joinTeam(test);
	    
	}

	@When("click on apply button with name as {string} & mob as {string} & email as {string}")
	public void click_on_apply_button_with_name_as_mob_as_email_as(String string, String string2, String string3) {
		join.applyNow(test,string,string2,string3);
	}  
	@When("choose linkedIn from dropdown")
	public void choose_linked_in_from_dropdown() throws IOException {
	    join.verifyText(test);
	}
	@Then("click on apply now button")
	public void click_on_apply_now_button() throws IOException {
		join.takeScreen(test);
	    
	}

}
