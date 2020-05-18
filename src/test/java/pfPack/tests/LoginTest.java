package pfPack.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pfPack.base.BaseTest;
import pfPack.pages.LaunchPage;
import pfPack.util.Constants;
import pfPack.util.ExtentManager;

public class LoginTest extends BaseTest{
	
	@Test
	public void testLogin() throws InterruptedException
	{
		eReport=ExtentManager.getInstance();
		eTest=eReport.startTest("LoginTest");
		eTest.log(LogStatus.INFO, "Login Test has started");
		openBrowser(Constants.BROWSER_TYPE);
		LaunchPage launchpage=new LaunchPage(driver, eTest);
		PageFactory.initElements(driver, launchpage);
		boolean loginstatus=launchpage.gotoLoginPage();
		if(loginstatus)
		{
			reportPass("Logged in successfully");
		} else {
			reportFail("Logged in unsuccessfully");
		}
	}
	
	@AfterMethod
	public void testVlosure()
	{
		if(eReport!=null)
		{
			eReport.endTest(eTest);
			eReport.flush();
		}
		
		if(driver!=null)
		{
			driver.quit();
		}
	}

}
