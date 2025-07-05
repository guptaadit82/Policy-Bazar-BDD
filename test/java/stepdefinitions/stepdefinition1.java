package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.specialStory;
import utils.WebDriverHelper;

public class stepdefinition1 {
	
	specialStory special =new specialStory();
	public static ExtentTest test;
    public WebDriverHelper helper;
	@Given("I open the Home Page and scroll to footer")
	public void i_open_the_home_page_and_scroll_to_footer() {
		 test=hooks.report.createTest("specialStory");
	    
	}
	@When("I perform functionality of newsroom module")
	public void i_perform_functionality_of_newsroom_module() throws IOException {
		special.fetchStory(test);
		
	    
	}
	@When("in input box try to add name")
	public void in_input_box_try_to_add_name() throws IOException {
		special.commentOnStory(test);
		
	    
	}
	@When("in input box try to add comment")
	public void in_input_box_try_to_add_comment() throws IOException {
		special.takeScreen(test);
	    
	}
	@Then("click on submit button")
	public void click_on_submit_button() throws IOException {
		special.verifyText(test);
	    
	}
}
