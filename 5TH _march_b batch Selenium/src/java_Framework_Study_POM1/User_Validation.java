package java_Framework_Study_POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Validation {
	
	@FindBy(xpath="//span[@class='user-id']")  private WebElement actualuserid;
	
	
	public User_Validation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Validateuser(WebDriver driver) {
		
		
		String UN = actualuserid.getText();
//		if(UN.equals()) {
//			System.out.println("TC is passed");
//		}
//		else {
//			System.out.println("TC is failed");
//		}
	}

}
