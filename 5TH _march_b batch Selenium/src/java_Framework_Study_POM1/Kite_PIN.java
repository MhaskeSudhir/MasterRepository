package java_Framework_Study_POM1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_PIN {

	
	@FindBy(id="pin")  private  WebElement pin;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement continuebutton;
	
	
	public Kite_PIN(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Sendpin() {
		pin.sendKeys("982278");
	}
	public void Clickoncontinuebutton() {
		continuebutton.click();
	}
}
	


