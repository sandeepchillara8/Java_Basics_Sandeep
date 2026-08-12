package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_Logintest extends BaseClass 
{
	@Test(groups={"Sanity","Master"})
	public void verifyTestLogin()
	{
		logger.info("******Starting TC002_Logintest******");
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		logger.info("******login******");
		LoginPage lp= new LoginPage(driver);
		String email=p.getProperty("email");
		lp.setEmailAddress(email);
		logger.info("entered email: "+email);
		String pass= p.getProperty("password");
		lp.setPassword(pass);
		logger.info("entered password: "+pass);
		lp.clickbtnLogin();
		MyAccountPage ma= new MyAccountPage(driver);
		Assert.assertEquals(ma.isMyAccountmsg(), "My Account");
		
		
	}

}
