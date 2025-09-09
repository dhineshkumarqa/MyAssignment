
package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_003_CreateLead extends ProjectSpecificMethods

{

	@Test
	public void cretaelead()
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName()
		.enterFirstname()
		.enterLastname()
		.clickCreateLeadButton()
		.verifyLead();
	}
	
}
