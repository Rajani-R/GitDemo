package package3;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
	public void OnTestFailure(ITestResult result)
	{
		System.out.println("result failed");
	}
}
