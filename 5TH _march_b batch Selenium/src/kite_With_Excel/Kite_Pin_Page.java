package kite_With_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Pin_Page {
	
	@FindBy(id="pin")  private  WebElement PIN;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement CONTBTN;
	
	public Kite_Pin_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Sendpin(String pin) {
		PIN.sendKeys(pin);
	}
	public void Clickoncontinuebutton() {
		CONTBTN.click();
	}

}
