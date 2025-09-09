package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods
{
	public MyHomePage (WebDriver driver)
	{
		this.driver = driver;
	}
	public MyLeadsPage clickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	    }

}
