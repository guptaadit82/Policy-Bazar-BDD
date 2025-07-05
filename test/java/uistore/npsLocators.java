package uistore;

import org.openqa.selenium.By;

public class npsLocators {
	private By siteMap=By.xpath("//a[@href='https://www.policybazaar.com/sitemap/']");
	
	public By getSiteMap() {
		return siteMap;
	}
	private By nps=By.xpath("//a[@href='https://www.policybazaar.com/life-insurance/pension-plans/nps-national-pension-scheme/']");
	
	public By getNps() {
		return nps;
	}
	private By age=By.xpath("//input[@id='invAge']");
	
	public By getAge() {
		return age;
	}
	private By expense=By.xpath("//input[@id='monthlyExpense']");
	
	public By getExpense() {
		return expense;
	}
	private By pension=By.xpath("//input[@id='invPensionAge']");
	
	public By getPension() {
		return pension;
	}
	private By btn=By.xpath("//a[text()='Calculate']");
	public By getBtn() {
		return btn;
	}
	private By text=By.xpath("//div[@class='retirement_calculator_heading showDesk']");
	public By getText() {
		return text;
	}
}
