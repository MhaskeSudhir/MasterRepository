package kite_With_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Change_User {

	@FindBy(linkText="Change user") private WebElement UC;
	
	public Change_User(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void Changeuser() {
		UC.click();
	}
	
}
