package uistore;

import org.openqa.selenium.By;

public class socialMediaLocators {
	private By reviews=By.xpath("//a[@href='https://www.policybazaar.com/reviews/']");
	
	public By getReviews() {
		return reviews;
	}
	private By popular=By.xpath("//a[@data-id='popular-review']");
	
	public By getPopular() {
		return popular;
	}
	private By insurance=By.xpath("//select[@id='frmProducts']");
	
	public By getInsurance() {
		return insurance;
	}
	private By social=By.xpath("//select[@id='social']");
	
	public By getSocial() {
		return social;
	}
	private By text=By.xpath("(//div[@class='title'])[4]");	
	public By getText() {
		return text;
	}
}
