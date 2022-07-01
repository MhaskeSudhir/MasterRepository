package soft_Assert_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	@FindBy(id="userid") private WebElement UN;
	@FindBy(id="password") private WebElement PASS;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LN;
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername(String username) {
		UN.sendKeys(username);
	}
	
	public void sendpass(String password) {
		PASS.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		LN.click();
	}
}
