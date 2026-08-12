package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistrationtest extends BaseClass
{
	
	@Test(groups={"Regression","Master"})
	void verify_account_Registration()
	{
		logger.info("*************Starting TC001_AccountRegistrationtest*********");
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("*************clicked on myaccount*********");
		hp.clickRegister();
		logger.info("*************clicked on register*********");
		RegistrationPage rp = new RegistrationPage(driver);
		logger.info("*************opened reg page*********");
		String firstname =RandomString().toUpperCase();
		rp.setFirstName(firstname);
		logger.info("entered firstname is: "+firstname);
		String lastname =RandomString().toUpperCase();
		rp.setLastName(lastname);
		logger.info("entered lastname is: "+lastname);
		String email =RandomString()+"@gmail.com";
		rp.setEmail(email);
		logger.info("entered email is: "+email);
		String phoneno =RandomNumber();
		rp.setTelephone(phoneno);
		logger.info("entered phone is: "+phoneno);
		String password=RandomAlphaNumeric();
		rp.setPassword(password);
		rp.setConfirmPassword(password);
		rp.clickSubscribe();
		rp.agree();
		rp.clickContinue();
		logger.info("*************filled all the details*********");
		Assert.assertEquals(rp.CheckSuccessmsg(), "Your Account Has Been Created!");
		
		
		
	}
	
	

}
