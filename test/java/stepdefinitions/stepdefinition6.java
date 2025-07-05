package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.queryBoxReview;
import utils.WebDriverHelper;

public class stepdefinition6 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    queryBoxReview query=new queryBoxReview();
	@When("navigate to query Box in the new page")
	public void navigate_to_query_box_in_the_new_page() throws IOException {
		test=hooks.report.createTest("queryBoxReview");
		query.fetchQuery(test);
	    
	}
	@When("write your name")
	public void write_your_name() throws IOException {
	    query.fillQuery(test);
	}
	@When("write your email")
	public void write_your_email() throws IOException, InterruptedException {
	  query.verifyText(test);
	}
	@When("write your mobile number  in required input boxes")
	public void write_your_mobile_number_in_required_input_boxes() throws IOException {
	    query.requestCallback(test);
	}
	@Then("click on proceed button")
	public void click_on_proceed_button() throws IOException {
		query.takeScreen(test);
	    
	}
}
