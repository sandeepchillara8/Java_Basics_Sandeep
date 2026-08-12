package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="input-email") WebElement txtemailaddress;
	@FindBy(id="input-password") WebElement txtPassowrd;
	@FindBy(xpath="//input[@type='submit']") WebElement btnLogin;
	
	
	public void setEmailAddress(String email)
	{
		txtemailaddress.sendKeys(email);
	}
	public void setPassword(String password)
	{
		txtPassowrd.sendKeys(password);
	}
	public void clickbtnLogin()
	{
		btnLogin.click();
	}

}
