package soft_Assert_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PIN_Page {
	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement CN;
	
	public PIN_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendpin(String mypin) {
		PIN.sendKeys(mypin);
	}
	
	public void clickOnContinuebutton() {
		CN.click();
	}
}
