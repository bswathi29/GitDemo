package testngFiles;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase {
	
	
	
	@Test
	public void Login() throws IOException
	{
		WebDriver driver=null;
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Swathi Belagundhi\\eclipse-workspace\\Framework\\src\\testngFiles\\datadriven.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
	
	if(prop.getProperty("browser").equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","C:\\Swathi\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();

	}
	else if(prop.getProperty("browser").equals("firefox"))
	{
	driver=new FirefoxDriver();
	}
	else 
	{
	driver=new InternetExplorerDriver();
	}
	
	//invoke url
	driver.get(prop.getProperty("url"));
	}

}
