package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods
{
	public ViewLeadPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LogoutPage verifyLead() {
		System.out.println("Lead is created");
		return new LogoutPage(driver);

	}

}
