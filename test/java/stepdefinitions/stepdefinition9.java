package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.editDetails;
import utils.WebDriverHelper;

public class stepdefinition9 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    editDetails edit=new editDetails();
	@When("navigate to other locations tag")
	public void navigate_to_other_locations_tag() {
		test=hooks.report.createTest("editDetails");
		edit.findDetails(test);
	}
	@When("choose Chennai from Drop Down")
	public void choose_chennai_from_drop_down() {
		edit.signIn(test);
		
	   
	}
	@When("click on first mob number")
	public void click_on_first_mob_number() {
		edit.VerifyText(test);
	 
	}
	@Then("dismiss the popup")
	public void dismiss_the_popup() {
		edit.takeScreen(test);
	    
	}

}
