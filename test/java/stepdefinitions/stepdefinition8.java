package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.careerAdvisor;
import utils.WebDriverHelper;

public class stepdefinition8 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    careerAdvisor advisor=new careerAdvisor();
	@When("navigate to other locations")
	public void navigate_to_other_locations() {
		test=hooks.report.createTest("careerAdvisor");
	}
	@When("click on first apply now")
	public void click_on_first_apply_now() {
		advisor.findJobs(test);
	  
	}
	@When("after clicking on Delhi location")
	public void after_clicking_on_delhi_location() throws InterruptedException {
		advisor.findAdvisors(test);
	    
	}
	@When("move to advisors of life Insurance")
	public void move_to_advisors_of_life_insurance() {
		advisor.VerifyText(test);
	   
	}
	@Then("check Shubham Nayak profile")
	public void check_shubham_nayak_profile() {
		advisor.takeScreen(test);
	    
	}



}
