package selenium_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_1St_Selenium_Program {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "G:\\5th march b batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://nathabit.in/?gclid=Cj0KCQjw6pOTBhCTARIsAHF23fI617eCgBDQdG3uE0eYpgGNn3mmaORbH2Bm27-YzW2aGp1YI82WTvkaAkrIEALw_wcB");
		
		//driver.navigate();
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		
		//driver.close();
		
		//driver.navigate();
		driver.navigate().forward();
		//driver.navigate().back();
		driver.navigate().refresh();

	}

}
