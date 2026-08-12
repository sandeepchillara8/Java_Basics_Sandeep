package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass
{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups={"Datadriven","Master"}) //getting dataprovider from diff class
	public void LoginDDT(String email,String pass,String exp)
	{
		logger.info("******Starting TC002_Logintest******");
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		logger.info("******login******");
		LoginPage lp= new LoginPage(driver);
		lp.setEmailAddress(email);
		logger.info("entered email: "+email);
		lp.setPassword(pass);
		logger.info("entered pass: "+pass);
		lp.clickbtnLogin();
		MyAccountPage ma= new MyAccountPage(driver);
		Assert.assertEquals(ma.isMyAccountmsg(), "My Account");
	}

}
