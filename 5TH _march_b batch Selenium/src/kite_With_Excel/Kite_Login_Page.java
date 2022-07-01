package kite_With_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page {
	//DATA MEMBERS/VARIABLES
	@FindBy(id="userid") private WebElement UN;
	
	@FindBy(id="password") private WebElement PWD;
	
	@FindBy(xpath="//button[text()='Login ']")  private WebElement LOGINBTN;
	
	
	
	//Constructor with parameter
	public Kite_Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Methods
	public void sendusername(String username) {
		UN.sendKeys(username);
	}
	
	public void sendpass(String password) {
		PWD.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		LOGINBTN.click();
	}

}
