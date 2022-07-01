package java_Framework_Study_POM1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page {
	
	//data members/variables

	@FindBy(id="userid") private WebElement UN;
	
	@FindBy(id="password") private WebElement pass;
	
	@FindBy(xpath="//button[text()='Login ']")   private WebElement loginbutton;
	
	//constructor
	
	public Kite_Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//method for each element
	
	public void SendUN(String Username) {
		UN.sendKeys(Username);
		
	}
	
	public void Sendpass(String password) {
		pass.sendKeys(password);
	}
	
	public void Clickonliginbutton() {
		loginbutton.click();
	}
	
	public String text() {
		String mytext = UN.getText();
		return (mytext);
	}
}
