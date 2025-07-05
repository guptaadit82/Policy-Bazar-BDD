package uistore;

import org.openqa.selenium.By;

public class rtoVehicleLocators {
	private By siteMap=By.xpath("//a[@href='https://www.policybazaar.com/sitemap/']");
	
	public By getSiteMap() {
		return siteMap;
	}
	private By rtoPage=By.xpath("//a[@href=\'https://www.policybazaar.com/rto/\']");
	
	public By getRtoPage() {
		return rtoPage;
	}
    private By rtoBox=By.xpath("//input[@class='fullWidht carRegistrationNumber']");
	
	public By getRtoBox() {
		return rtoBox;
	}
	private By kia=By.xpath("(//label[@data-id='64'])[1]");
	
	public By getKia() {
		return kia;
	}
	private By fuel=By.xpath("(//label[@data-id='692'])[1]");
	
	public By getFuel() {
		return fuel;
	}
	private By variant=By.xpath("(//label[@data-id='9'])[1]");
	
	public By getVariant() {
		return variant;
	}
	private By model=By.xpath("(//label[@data-id='6157'])[1]");
	
	public By getModel() {
		return model;
	}
	private By year=By.xpath("(//label[@data-id='2020'])[1]");
	
	public By getYear() {
		return year;
	}
	private By text=By.xpath("//span[text()='Almost there! Just one more step']");
	
	public By getText() {
		return text;
	}
	
}
