package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.socialMediaReview;
import utils.WebDriverHelper;

public class stepdefinition5 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    socialMediaReview social=new socialMediaReview();
	@When("I perform functionality of customer review module")
	public void i_perform_functionality_of_customer_review_module() {
		test=hooks.report.createTest("socialMediaReview");
	}

	@When("navigate to popular review section")
	public void navigate_to_popular_review_section() throws IOException {
		social.beSocial(test);
	}

	@When("filter by insurance type")
	public void filter_by_insurance_type() throws IOException {
		social.popularReviews(test);
	}

	@When("also filter by posts in which choose  Instagram posts")
	public void also_filter_by_posts_in_which_choose_instagram_posts() throws IOException {
		social.takeScreen(test);
		
	}

	@Then("analyze the results")
	public void analyze_the_results() throws IOException {
		social.VerifyText(test);
		
	}

}
