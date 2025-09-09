package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	
	public WelcomePage(WebDriver driver) 
	{
		this.driver=driver;
	}


	public MyHomePage clickCRMSFA() {
		driver.findElement(By.partialLinkText("CRM")).click();
		return new MyHomePage(driver);
	    }

}
