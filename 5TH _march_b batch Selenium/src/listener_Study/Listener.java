package listener_Study;



import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	
	public void onTestFailure(ITestResult result)
	{
	Reporter.log("TC is failed, screenshot taken",true);
	ITestListener.super.onTestFailure(result);
	Reporter.log("Failed TC name is"+result.getName(), true);
	
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("TC is success",true);
	ITestListener.super.onTestSuccess(result);
	Reporter.log("Success TC name is"+result.getName(), true);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
	Reporter.log("TC is skipped, please check dependent TC",true);
	ITestListener.super.onTestSkipped(result);
	Reporter.log("Skipped TC name is"+result.getName(), true);
	
	}

}
