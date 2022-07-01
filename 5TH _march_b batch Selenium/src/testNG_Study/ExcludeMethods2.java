package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExcludeMethods2 {
	 @Test
	  public void mymethod6() {
		  Reporter.log("Mymethod 6 is running",true);
	  }
	  @Test
	  public void mymethod7() {
		  
		  Reporter.log("Mymethod 7 is running",true);
		  
	  }
	  
	  @Test
	  public void mymethod8() {
		  Reporter.log("Mymethod 8 is running",true);
	  }
	  @Test
	  public void mymethod9() {
		  
		  Reporter.log("Mymethod 9 is running",true);
	  }
	  @Test
	  public void mymethod10() {
		  Reporter.log("Mymethod 10 is running",true);
	  }
}
