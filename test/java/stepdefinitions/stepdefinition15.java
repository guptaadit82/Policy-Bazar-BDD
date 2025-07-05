package stepdefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.rtoVehicleChecker;
import utils.WebDriverHelper;

public class stepdefinition15 {
	public static ExtentTest test;
    public WebDriverHelper helper;
    rtoVehicleChecker rto= new rtoVehicleChecker();
	@When("navigate to RTO page")
	public void navigate_to_rto_page() {
		test=hooks.report.createTest("rtoVehicleChecker");
	    
	}
	@When("Enter car number as {string} in input box")
	public void enter_car_number_as_in_input_box(String string) throws IOException {
	    rto.rtoPage(test);
	    rto.findRtoDetails(test,string);
	}
	@When("click on required car brand and enter car brand values")
	public void click_on_required_car_brand_and_enter_car_brand_values() throws IOException {
//		rto.findRtoDetails(test);
	}
	@When("click on model and enter car model values")
	public void click_on_model_and_enter_car_model_values() throws IOException {
		
//		rto.selectCar(test);
	    
	}
	@When("click on Fuel Type and enter fuel type values")
	public void click_on_fuel_type_and_enter_fuel_type_values() throws IOException {
//		rto.verifyText(test);
	    
	}
	@Then("click on year Timeline and enter year values & Submit")
	public void click_on_year_timeline_and_enter_year_values_submit() throws IOException {
//		rto.takeScreen(test);
	    
	}
}
