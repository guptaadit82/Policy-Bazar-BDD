package uistore;

import org.openqa.selenium.By;

public class careerAdvisorLocators {
	private By career=By.xpath("//a[@href='https://www.policybazaar.com/careers/']");
	
	public By getCareer() {
		return career;
	}
	private By otherLocations=By.xpath("//a[@href='https://www.policybazaar.com/stores/']");
	
	public By getOtherLocations() {
		return otherLocations;
	}
	private By delhi=By.xpath("//li[@data-id='551']");
	
	public By getDelhi() {
		return delhi;
	}
	private By advisors=By.xpath("//li[@id='advisor-details']");
	
	public By getAdvisors() {
		return advisors;
	}
	private By termLife=By.xpath("//div[@rel='termlife']");
	
	public By getTermLife() {
		return termLife;
	}
	private By text=By.xpath("(//h3[text()='Shubham Nayak'])[1]");
	
	public By getText() {
		return text;
	}
	
	
}
