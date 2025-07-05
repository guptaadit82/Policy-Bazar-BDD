package uistore;

import org.openqa.selenium.By;

public class specialStoryLocators {
	private By newsroom=By.xpath("//a[@href='https://www.policybazaar.com/pblife/newsroom/']");
	
	public By getNewsroom() {
		return newsroom;
	}
	private By newsroom2=By.xpath("//a[@href='https://www.policybazaar.com/pblife/newsroom']");
	public By getNewsroom2() {
		return newsroom2;
	}
	
	private By specialStory=By.xpath("(//a[@href='https://www.policybazaar.com/pblife/newsroom/special-story'])[1]");
	public By getSpecialStory() {
		return specialStory;
	}
	
	
	private By firstStory=By.xpath("(//a[@data-category='Special Story'])[3]");
	
	public By getFirstStory() {
		return firstStory;
	}
	private By commentBtn=By.xpath("//div[@class='add-comment-button']");
	
	public By getCommentBtn() {
		return commentBtn;
	}
	private By name=By.xpath("//input[@id='from_name']");
	
	public By getName() {
		return name;
	}
	private By comment=By.xpath("//textarea[@id='comment_text']");
	
	public By getComment() {
		return comment;
	}
	private By submitBtn=By.xpath("//button[@class='button addcomments']");
	
	public By getSubmitBtn() {
		return submitBtn;
	}
	private By text=By.xpath("//p[text()='Special Story']");
	
	public By getText() {
		return text;
	}
	
	
}
