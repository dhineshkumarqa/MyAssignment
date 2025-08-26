package week6.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseClass
{
	WebDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void precondition(String url,  String username, String Password)
	{
      ChromeOptions option = new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  driver = new ChromeDriver(option);
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(Password);
	  driver.findElement(By.id("Login")).click();
	}
	
	
	  @AfterMethod
	  public void postcondition()
	  { 
		  driver.close();
	  }
	 

}
