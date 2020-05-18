package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

import pfPack.base.BasePage;

public class HomePage extends BasePage{
	
	
	@FindBy(css="span[class^='_logo-books']")
	public WebElement BooksOption;
	
	@FindBy(css="span[class^='_logo-campaigns']")
	public WebElement CampaignsOption;
	
	@FindBy(css="[span[class^='_logo-crm']")
	public WebElement CrmOption;
	
	@FindBy(css="span[class^='_logo-chat']")
	public WebElement CliqsOption;
	
	//Reusable methods
	
	//Constructor
		public HomePage(WebDriver driver, ExtentTest eTest) {
			this.driver=driver;
			this.eTest=eTest;
		}
		
		public boolean verifyDisplayHomePage()
		{
			return(isElementPresent(CrmOption));
		}
}
