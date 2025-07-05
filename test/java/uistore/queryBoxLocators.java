package uistore;

import org.openqa.selenium.By;

public class queryBoxLocators {
	private By reviews=By.xpath("//a[@href='https://www.policybazaar.com/reviews/']");
	
	public By getReviews() {
		return reviews;
	}
	private By fullname=By.xpath("//input[@id='askname']");
	
	public By getFullname() {
		return fullname;
	}
	private By mobile=By.xpath("//input[@id='askmobile']");
	
	public By getMobile() {
		return mobile;
	}
	private By btn=By.xpath("//a[@class='submit_button askcontinue']");
	public By getBtn() {
		return btn;
	}
	private By email=By.xpath("//input[@id='askemail']");
	
	public By getEmail() {
		return email;
	}
	private By btn2=By.xpath("//button[@class='btn askproceed']");
	
	public By getBtn2() {
		return btn2;
	}
	private By selelct1=By.xpath("//select[@id='product']");
	
	public By getSelect1() {
		return selelct1;
	}
	private By selelct2=By.xpath("//select[@id=\'query-type\']");
	
	public By getSelect2() {
		return selelct2;
	}
	private By proceed=By.xpath("//button[@class='btn login-button']");
	
	public By getProcedd() {
		return proceed;
	}
	private By text=By.xpath("(//h3[@class='title'])[2]");
	
	public By getText() {
		return text;
	}
	
	
	
	
	
	
	
}
