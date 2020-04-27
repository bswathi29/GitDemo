package testngFiles2.copy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest
	public void OpeningBrowser()
	{
	System.out.println("before all test cases");
	}
	
	@BeforeMethod
	public void MethodTest()
	{
	System.out.println("before each method");
	}
	
	@AfterTest
	public void LastBrowser()
	{
	System.out.println("after all test cases");
	}

	@AfterMethod
	public void closebrowser()
	{
	System.out.println(" After each method");
	}
	
	@Test
	public void ClosingBrowser()
	{
	System.out.println("test1");
	}
	
	@Test(dependsOnMethods= {"ClosingBrowser"})
	public void ClearCooky()
	{
	System.out.println("test2");
	}
	
	@Test(dependsOnMethods= {"ClearCooky3"}, alwaysRun=true)
	public void ClearCooky2()
	{
	System.out.println("test3");
	}

	@Test(timeOut=1000)
	public void ClearCooky3() throws InterruptedException
	{
	//	Thread.sleep(3000);
	System.out.println("test4");
	}

}
