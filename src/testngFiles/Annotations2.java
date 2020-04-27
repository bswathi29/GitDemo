package testngFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotations2 {
	
	@BeforeSuite
	public void installsoftware()
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void deinstallsoftware()
	{
		System.out.println("After suite1");
	}

}
