
package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_003_CreateLead extends ProjectSpecificMethods

{
	@BeforeTest
	public void dataleads()
	{
	    Filename = "Createlead";
	}

	@Test(dataProvider = "sendexcel")
	public void cretaelead(String Username, String Password, String cname,String fname, String lname )
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(Username)
		.enterPassword(Password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(cname)
		.enterFirstname(fname)
		.enterLastname(lname)
		.clickCreateLeadButton()
		.verifyLead();
	}
	
}
