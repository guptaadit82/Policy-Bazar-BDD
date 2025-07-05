package uistore;

import org.openqa.selenium.By;

public class editDetailsLocators {
private By career=By.xpath("//a[@href='https://www.policybazaar.com/careers/']");
	
	public By getCareer() {
		return career;
	}
	private By otherLocations=By.xpath("//a[@href='https://www.policybazaar.com/stores/']");
	
	public By getOtherLocations() {
		return otherLocations;
	}
	private By delhi=By.xpath("(//div[@class='item flexbox colum'])[2]");
	
	public By getDelhi() {
		return delhi;
	}
	private By signin=By.xpath("//span[@id='usersign_click']");
	
	public By getSignIn() {
		return signin;
	}
	private By number=By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]");
	
	public By getNumber() {
		return number;
	}
	private By Btn=By.xpath("(//span[@class='central-login-sign-in-with-otp-span-class '])[2]");
	
	public By getBtnn() {
		return Btn;
	}
	private By text=By.xpath("(//div[@class='header'])[2]");
	
	public By getText() {
		return text;
	}
	
	
	
	
}
