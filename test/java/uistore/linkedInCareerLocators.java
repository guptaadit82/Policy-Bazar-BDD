package uistore;

import org.openqa.selenium.By;

public class linkedInCareerLocators {
	private By career=By.xpath("//a[@href='https://www.policybazaar.com/careers/']");
	
	public By getCareer() {
		return career;
	}
	private By joinTeam=By.xpath("(//a[@href='#dreamjob'])[1]");
	
	public By getJoinTeam() {
		return joinTeam;
	}
	private By applyNow=By.xpath("(//a[text()='Apply now'])[1]");
	
	public By getApplyNow() {
		return applyNow;
	}
	private By name=By.xpath("//input[@id='frm3Name']");
	
	public By getName() {
		return name;
	}
	private By email=By.xpath("//input[@id='frm3EmailId']");
	
	public By getEmail() {
		return email;
	}
	private By mobile=By.xpath("//input[@id='frm3MobileNo']");
	
	public By getMobile() {
		return mobile;
	}
	private By howdo=By.xpath("//select[@id='howdidhere']");
	
	public By getHowDO() {
		return howdo;
	}
	private By close=By.xpath("(//a[@class='close'])[2]");
	
	public By getClose() {
		return close;
	}
	private By text=By.xpath("(//div[@class='career-heading-title md'])[2]");
	
	public By getText() {
		return text;
	}
	
	
	
}
