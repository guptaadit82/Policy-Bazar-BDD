package uistore;

import org.openqa.selenium.By;

public class silverRateFdLocators {
private By siteMap=By.xpath("//a[@href='https://www.policybazaar.com/sitemap/']");
	
	public By getSiteMap() {
		return siteMap;
	}
	private By silverrate=By.xpath("//a[@href='https://www.policybazaar.com/silver-rate/']");
	
	public By getSilverRate() {
		return silverrate;
	}
	private By stateDrop=By.xpath("//select[@id='exampleSelectState']");
	
	public By getStateDrop() {
		return stateDrop;
	}
	private By cityDrop=By.xpath("//select[@id='exampleSelect1']");
	public By getCityDrop() {
		return cityDrop;
	}
	private By nearestCity=By.xpath("//select[@id='city']");
	public By getNearestCity() {
		return nearestCity;
	}
	private By calculate=By.xpath("//input[@id='btnpriceResult']");
	public By getCalculate() {
		return calculate;
	}
	private By text=By.xpath("//h2[@class='white underline']");
	public By getText() {
		return text;
	}
}
