package uistore;

import org.openqa.selenium.By;

public class postalInsuranceLocators {
	private By siteMap=By.xpath("//a[@href='https://www.policybazaar.com/sitemap/']");
	
	public By getSiteMap() {
		return siteMap;
	}
	private By pis=By.xpath("//a[@href='https://www.policybazaar.com/insurance-companies/postal-life-insurance/']");
	
	public By getPis() {
		return pis;
	}
	private By planBtn=By.xpath("(//button[@class='btn bannertermredirect'])[1]");
	public By getPlanBtn() {
		return planBtn;
	}
	private By nameBox=By.xpath("(//input[@id='termName'])[2]");
	public By getNameBox() {
		return nameBox;
	}
	private By dobBox=By.xpath("(//input[@class='fullWidht'])[2]");
	public By getDobBox() {
		return dobBox;
	}
	private By mobBox=By.xpath("(//input[@id='termMobile'])[2]");
	public By getMobBox() {
		return mobBox;
	}
	private By checkPlanBtn=By.xpath("(//div[@id='btnSubmitTerm'])[2]");
	public By getCheckPlanBtn() {
		return checkPlanBtn;
	}
	private By text=By.xpath("//h1[text()='Postal Life Insurance']");
	public By getText() {
		return text;
	}
	
	
					
	
}
