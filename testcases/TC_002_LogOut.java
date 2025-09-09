package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_002_LogOut extends ProjectSpecificMethods {
	
	@Test
	public void Logout()
	{
	LoginPage lp = new LoginPage(driver);
	lp.enterPassword()
	.enterPassword()
	.clickLoginButton()
	.clickCRMSFA()
	.clickLeadsLink()
	.clickCreateLeadLink()
	.enterCompanyName()
	.enterFirstname()
	.enterLastname()
	.clickCreateLeadButton()
	.verifyLead()
	.logout();
	
	}

}
 