package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utilis.ReadExceldata;

public class ProjectSpecificMethods 
{
	public  WebDriver driver;
	public String Filename;
	
	@BeforeMethod	
	public void precondition()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}

	
	@DataProvider
	public String[][] sendexcel() throws IOException
	{
		return ReadExceldata.sendData(Filename);
		
	}
}
