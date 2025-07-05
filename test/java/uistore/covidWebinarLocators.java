package uistore;

import org.openqa.selenium.By;

public class covidWebinarLocators {
	private By newsroom=By.xpath("//a[@href='https://www.policybazaar.com/pblife/newsroom/']");
	
	public By getNewsroom() {
		return newsroom;
	}
	private By decoding=By.xpath("//a[@href='https://www.policybazaar.com/pblife/decoding-insurance']");
	
	public By getDecoding() {
		return decoding;
	}
	private By webinar=By.xpath("//a[@href='https://www.policybazaar.com/pblife/decoding-insurance/webinars/']");
	
	public By getWebinar() {
		return webinar;
	}
	private By iplan=By.xpath("(//a[@class='webCategory'])[3]");
	
	public By getIplan() {
		return iplan;
	}
	private By covid=By.xpath("//p[text()='NiveshKarBefikar with Santosh Agarwal: Investment in The Times of Covid-19']");
	
	public By getCovid() {
		return covid;
	}
	private By email=By.xpath("//input[@id='email_id']");
	
	public By getEmail() {
		return email;
	}
	private By btn=By.xpath("//button[@class='subscribe']");
	
	public By getBtn() {
		return btn;
	}
	private By text=By.xpath("(//p[@class='heading'])[3]");
	
	public By getText() {
		return text;
	}
	
	
	
	
	
	
}
