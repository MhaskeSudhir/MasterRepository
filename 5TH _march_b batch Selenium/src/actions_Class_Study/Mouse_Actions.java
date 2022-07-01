package actions_Class_Study;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement element = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		act.moveToElement(element).click().build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement myelement = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		
		act.moveToElement(myelement).contextClick().build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement drag = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		Thread.sleep(5000);
		act.dragAndDrop(drag, drop).perform();
		
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.moveToElement(doubleclick).doubleClick().build().perform();
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.getText();
		alt.accept();
		
		
		
		

	}

}
