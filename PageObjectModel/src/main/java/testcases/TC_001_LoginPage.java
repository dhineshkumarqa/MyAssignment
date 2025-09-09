package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_001_LoginPage extends ProjectSpecificMethods
{
	@BeforeTest
	public void setvalues()
	{
		Filename = "Login";
	}
	
	@Test(dataProvider = "sendexcel")
	public void logipage(String Username, String Password)
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(Username)
		.enterPassword(Password)
		.clickLoginButton();
	} 
}
