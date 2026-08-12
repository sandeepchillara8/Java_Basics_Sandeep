package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC004_AccountRegistrationDDT extends BaseClass
{
	@Test(dataProvider="RegistrationData", dataProviderClass=DataProviders.class,groups={"Datadriven","Master"})
	public void regData(String fn,String ln,String phone,String pass,String confirmpass)
	{
		logger.info("*************Starting TC001_AccountRegistrationtest*********");
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("*************clicked on myaccount*********");
		hp.clickRegister();
		logger.info("*************clicked on register*********");
		RegistrationPage rp = new RegistrationPage(driver);
		logger.info("*************opened reg page*********");
		rp.setFirstName(fn);
		logger.info("entered firstname is: "+fn);
		rp.setLastName(ln);
		logger.info("entered lastname is: "+ln);
		String email=RandomString()+"@gmail.com";
		rp.setEmail(email);
		logger.info("entered email is: "+email);
		rp.setTelephone(phone);
		logger.info("entered phone is: "+phone);
		rp.setPassword(pass);
		rp.setConfirmPassword(pass);
		rp.clickSubscribe();
		rp.agree();
		rp.clickContinue();
		logger.info("*************filled all the details*********");
		Assert.assertEquals(rp.CheckSuccessmsg(), "Your Account Has Been Created!");
	}

}
