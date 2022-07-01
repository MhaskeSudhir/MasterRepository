package soft_Assert_Study;


import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_and_Hard_Assert {
 
	SoftAssert soft=new SoftAssert();
	@Test
  public void mymethod() {
	  
	  String a="VCTC";
	  String b="VCTC";
	  
	  soft.assertEquals(a, b, "TC is failed");
	  Reporter.log("TC is passed",true);
	  
	  soft.assertNull(b, "not null");
	  Reporter.log("Null", true);
	  
	  soft.assertNotNull(a, "a is null");
	  Reporter.log("a is not null", true);
	  
	  soft.assertAll();
	  
	  
	  
  }
}
