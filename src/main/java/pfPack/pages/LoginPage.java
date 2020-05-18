package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPack.base.BasePage;
import pfPack.util.Constants;

public class LoginPage extends BasePage{

	//WebElements of Login page
	
	@FindBy(id="login_id")
	public WebElement EmailField;
	
	@FindBy(id="password")
	public WebElement PasswordField;
	
	@FindBy(id="nextbtn")
	public WebElement Next_Btn;
	
	
	//Reusable methods in Login page
	
	//Constructor
	public LoginPage(WebDriver driver,ExtentTest eTest )
	{
		this.driver=driver;
		this.eTest=eTest;
	}

	public boolean doLogin() throws InterruptedException {
		
		EmailField.sendKeys(Constants.USERNAME);
		Next_Btn.click();
		Thread.sleep(5);
		PasswordField.sendKeys(Constants.PASSWORD);
		Thread.sleep(5);
		eTest.log(LogStatus.INFO, "Email and fields entered");
		Next_Btn.click();
		Thread.sleep(10);
		eTest.log(LogStatus.INFO, "SignIn button clicked");
		HomePage homepage = new HomePage(driver,eTest);
		PageFactory.initElements(driver, homepage);
		boolean loginstatus = homepage.verifyDisplayHomePage();
		return loginstatus;
	}
	
}
