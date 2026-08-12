package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{

	public MyAccountPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement msgHeading;
	@FindBy(xpath="//a[normalize-space()='Logout' and @class='list-group-item']")
	WebElement btnLogout;
	
	public String isMyAccountmsg()
	{
		msgHeading.getText();
		return msgHeading.getText();
	}
	public void clickLogout()
	{
		btnLogout.click();
	}

}
