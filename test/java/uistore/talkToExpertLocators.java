package uistore;

import org.openqa.selenium.By;

public class talkToExpertLocators {
	private By newsroom=By.xpath("//a[@href='https://www.policybazaar.com/pblife/newsroom/']");
	
	public By getNewsroom() {
		return newsroom;
	}
	private By policy=By.xpath("(//a[@href='https://www.policybazaar.com/?source=PBLife'])[1]");
	
	public By getPolicy() {
		return policy;
	}
	private By allProducts=By.xpath("//a[@class='view-all-prd']");
	
	public By getAllProducts() {
		return allProducts;
	}
	private By ulips=By.xpath("(//span[@class='link'])[19]");
	
	public By getUlips() {
		return ulips;
	}
	private By talkexpert=By.xpath("//span[@class='talk_expert']");
	
	public By getTalkexpert() {
		return talkexpert;
	}
    private By text=By.xpath("//p[@class='txtReachNumber']");
	
	public By getText() {
		return text;
	}
	
	
	
	
}
