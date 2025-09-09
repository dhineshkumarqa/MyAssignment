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
	
	public LoginPage enterUsername(String Username)
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
		return this;
	}

	public LoginPage enterPassword(String Password)
	{
		driver.findElement(By.id("password")).sendKeys(Password);
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
