package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExcludeMethods1 {
	
	//don't want to execute method2 and 5
	 @Test
	  public void mymethod5() {
		  Reporter.log("Mymethod 5 is running",true);
	  }
	  @Test
	  public void mymethod1() {
		  
		  Reporter.log("Mymethod 1 is running",true);
		  
	  }
	  
	  @Test
	  public void mymethod3() {
		  Reporter.log("Mymethod 3 is running",true);
	  }
	  @Test
	  public void mymethod4() {
		  
		  Reporter.log("Mymethod 4 is running",true);
	  }
	  @Test
	  public void mymethod2() {
		  Reporter.log("Mymethod 2 is running",true);
	  }
}
