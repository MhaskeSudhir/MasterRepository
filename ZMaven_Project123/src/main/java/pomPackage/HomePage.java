package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(id="twotabsearchtextbox") private WebElement SB;   //searchbar
	@FindBy(id="nav-search-submit-button") private WebElement BTN;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchproduct(String product) {
		SB.sendKeys(product);
	}
	
	public void clickOnsearchButton() {
		BTN.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
