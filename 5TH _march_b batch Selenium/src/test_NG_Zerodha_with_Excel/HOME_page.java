package test_NG_Zerodha_with_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOME_page {

	@FindBy(xpath="//span[@class='user-id']") private WebElement USER;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LO;
	
	public HOME_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String validateUser()  {
		String actuserid = USER.getText();
		return actuserid;
		
		
		
		}
	
	public void clickonlogout() throws InterruptedException {
		Thread.sleep(2000);
		USER.click();
		Thread.sleep(2000);
		LO.click();
	}
}
