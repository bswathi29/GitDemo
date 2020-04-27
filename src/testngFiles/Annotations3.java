package testngFiles;

//import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations3 {
	
	@BeforeGroups("priority1")
	public void ClearCooky11()
	{
	System.out.println("Before group");
	}
	
	@Test(groups= {"priority2"})
	public void ClearCooky1()
	{
	System.out.println("test1");
	}
	
	@Test(groups= {"priority1"})
	public void ClearCooky2()
	{
	System.out.println("test2");
	}
	
	@Test(groups= {"priority2"})
	public void ClearCooky3()
	{
	System.out.println("test3");
	}

	@Test(groups= {"priority1"})
	public void ClearCooky4()
	{
	System.out.println("test4");
	}

	@Test()
	@Parameters({"para1"})
	public void ClearCooky5(String userid)
	{
	System.out.println("test5 and "+userid);
	}
	
	@Test(dataProvider="getData")
	public void userid(String username, String password, String id)
	{
		System.out.println("Dat provider test "+username+" pwd "+password+" id  is"+id);
	}
	@DataProvider
	public Object[][] getData()
	{
		//i is no of times test case should run
		//j no.of parameters it should send at one go
		Object[][] data=new Object[3][3];
		data[0][0]="abcd";
		data[0][1]="xyz";
		data[0][2]="ddd";
		
		data[1][0]="abcd2";
		data[1][1]="xyz2";
		data[1][2]="ddd2";
		
		data[2][0]="abcd3";
		data[2][1]="xyz3";
		data[2][2]="ddd3";
		
		return data;
				}
	
}
