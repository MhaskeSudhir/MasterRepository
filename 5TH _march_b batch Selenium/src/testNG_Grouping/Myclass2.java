package testNG_Grouping;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myclass2 {
	 @Test (groups = "Regression")
	  public void mymethod5() {
		  
		  Reporter.log("My method 5 is ok", true);
		  
	  }
	 @Test (groups = "sanity")
	  public void mymethod6() {
		  
		  Reporter.log("My method 6 is ok", true);
		  
	  }
	 @Test (groups = "Regression")
	  public void mymethod7() {
		 
		  Reporter.log("My method 7 is ok", true);
		  
	  }
	 @Test
	  public void mymethod8() {
		  
		  Reporter.log("My method 8 is ok", true);
		  
	  }
}
