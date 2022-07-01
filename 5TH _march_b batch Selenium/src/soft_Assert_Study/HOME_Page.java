package soft_Assert_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HOME_Page {
	@FindBy(xpath="//span[@class='user-id']") private WebElement USER;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LO;
	
	public HOME_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String validateUser()  {
		String actuserid = USER.getText();
		return actuserid;
		
		
		
		}
	public void clickonlogout() throws InterruptedException {
		Thread.sleep(3000);
		USER.click();
		Thread.sleep(2000);
		LO.click();
	}
}
