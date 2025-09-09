package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class LogoutPage extends ProjectSpecificMethods
{
	public LogoutPage (WebDriver driver)
	{
		this.driver=driver;
	}


	public LogoutPage logout()
	{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		return this;
	}

}
	