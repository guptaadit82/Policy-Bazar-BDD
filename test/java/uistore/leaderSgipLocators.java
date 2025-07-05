package uistore;

import org.openqa.selenium.By;

public class leaderSgipLocators {
	private By newsroom=By.xpath("//a[@href='https://www.policybazaar.com/pblife/newsroom/']");
	
	public By getNewsroom() {
		return newsroom;
	}
	private By newsroom2=By.xpath("//a[@href='https://www.policybazaar.com/pblife/newsroom']");
	public By getNewsroom2() {
		return newsroom2;
	}
	private By leadership=By.xpath("(//a[@href='https://www.policybazaar.com/pblife/newsroom/leadership-view'])[1]");
	public By getLeadership() {
		return leadership;
	}
	private By sortBy=By.xpath("//select[@id='sort_by']");
	public By getSortBy() {
		return sortBy;
	}
	private By box=By.xpath("//a[text()='Should you have more than one nominee in your term insurance?']");
	public By getBox() {
		return box;
	}
	private By nominee=By.xpath("//a[@href='https://www.policybazaar.com/pblife/search?q= NOMINEE']");
	public By getNominee() {
		return nominee;
	}
	private By text=By.xpath(" //p[text()=' NOMINEE']");
	public By getText() {
		return text;
	}
}
