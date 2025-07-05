package uistore;

import org.openqa.selenium.By;

public class unionBankFdLocators {
	private By siteMap=By.xpath("//a[@href='https://www.policybazaar.com/sitemap/']");
	
	public By getSiteMap() {
		return siteMap;
	}
	private By banks=By.xpath("//a[@href='https://www.policybazaar.com/fd-banks-sitemap/']");
	
	public By getBanks() {
		return banks;
	}
	private By ubiCalc=By.xpath("//a[@href='https://www.policybazaar.com/fd-interest-rates/union-bank-of-india-fd-rates/calculator/']");
	
	public By getUbiCalc() {
		return ubiCalc;
	}
	private By investment=By.xpath("//input[@id='fd-investment']");
	
	public By getInvestment() {
		return investment;
	}
	private By roi=By.xpath("//input[@id='fd-roi']");
	
	public By getRoi() {
		return roi;
	}
	private By timePeriod=By.xpath("//input[@id='fd-time-period']");
	
	public By getTimePeriod() {
		return timePeriod;
	}
	private By btn=By.xpath("//button[@class='btnViewQuotesNavBar fd-calculator-button']");
	
	public By getBtn() {
		return btn;
	}
	private By text=By.xpath("//div[@class='fd-calculator-heading']");
	
	public By getText() {
		return text;
	}
}
