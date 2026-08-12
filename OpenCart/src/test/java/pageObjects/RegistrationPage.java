package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends BasePage
{
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="input-firstname") WebElement txtFirstName;
	@FindBy(id="input-lastname") WebElement txtLastName;
	@FindBy(id="input-email") WebElement txtEmail;
	@FindBy(id="input-telephone") WebElement txtTelephone;
	@FindBy(id="input-password") WebElement txtPassword;
	@FindBy(id="input-confirm") WebElement txtConfPassword;
	@FindBy(xpath="//label[normalize-space()='Yes']") WebElement btnSubscribe;
	@FindBy(xpath="//input[@name='agree']") WebElement btnAgree;
	@FindBy(xpath="//input[@type='submit']") WebElement btnContinue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement msgConfirmation;
	
	//for every element - need a action method
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setTelephone(String phone)
	{
		txtTelephone.sendKeys(phone);
	}
	public void setPassword(String pass)
	{
		txtPassword.sendKeys(pass);
	}
	public void setConfirmPassword(String pass)
	{
		txtConfPassword.sendKeys(pass);
	}
	
	public void clickSubscribe()
	{
		btnSubscribe.click();
	}
	public void agree()
	{
		btnAgree.click();
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
	public String CheckSuccessmsg()
	{
		return msgConfirmation.getText();
	}

}
