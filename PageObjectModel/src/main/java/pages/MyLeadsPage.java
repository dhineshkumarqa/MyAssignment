package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods
{
	public MyLeadsPage (WebDriver driver)
	{
		this.driver=driver;
	}
	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	    }

}
