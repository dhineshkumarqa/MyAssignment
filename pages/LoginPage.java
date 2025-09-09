 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods
{
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage enterUsername()
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		return this;
	}

	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	 
	public WelcomePage clickLoginButton() 
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		//WelcomePage wp=new WelcomePage();
		//return wp;
		return new WelcomePage(driver);
	}

}
