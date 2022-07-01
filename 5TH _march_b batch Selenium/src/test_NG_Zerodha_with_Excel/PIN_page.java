package test_NG_Zerodha_with_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIN_page {
	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement CN;
	
	public PIN_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendpin(String pin) {
		PIN.sendKeys(pin);
	}
	
	public void clickOnContinuebutton() {
		CN.click();
	}
}
