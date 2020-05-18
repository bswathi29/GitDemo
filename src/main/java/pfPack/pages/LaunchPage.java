package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPack.base.BasePage;
import pfPack.util.Constants;

public class LaunchPage extends BasePage{

	//WebElements of Launch page
	
	@FindBy(className="zh-customers")
	public WebElement Customers;
	
	@FindBy(className="zh-support")
	public WebElement Support;
	
	@FindBy(className="zh-contact")
	public WebElement Contact_Sales;
	
	@FindBy(className="zh-login")
	public WebElement Login;//
	
	@FindBy(className="zh-signup")
	public WebElement Free_Signup;
	
	//Reusable methods in Launch page
	
	//Constructor
	public LaunchPage(WebDriver driver,ExtentTest eTest )
	{
		this.driver=driver;
		this.eTest=eTest;
	}
	public boolean gotoLoginPage() throws InterruptedException
	{
		driver.get(Constants.APP_URL);
		eTest.log(LogStatus.INFO, "Application URL opened");
		Login.click();
		eTest.log(LogStatus.INFO, "Login button clicked");
		LoginPage loginpage=new LoginPage(driver,eTest);
		PageFactory.initElements(driver, loginpage);
		
		boolean loginstatus=loginpage.doLogin();
		return loginstatus;
	}
	
}
