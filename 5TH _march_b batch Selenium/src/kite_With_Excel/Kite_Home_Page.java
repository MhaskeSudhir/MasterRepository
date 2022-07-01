package kite_With_Excel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page {

	//data members
	@FindBy(xpath="//span[@class='user-id']")  private WebElement ACTUSERID;
	@FindBy(xpath="//a[@target='_self']")  private WebElement LOGOUTBTN;
	
	
	
	public Kite_Home_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	public void validateuser(String username) {
		String ExpUserid = username;
		String Actual = ACTUSERID.getText();
		if(Actual.equals(ExpUserid)) {
			System.out.println("TC IS PASSED");
		}
		else {
			System.out.println("TC IS FAILED");
		}
		}
	
	public void logout() throws InterruptedException {
		ACTUSERID.click();
		Thread.sleep(3000);
		LOGOUTBTN.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
