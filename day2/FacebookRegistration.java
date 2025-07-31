package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Dhineshkumar");
		
		driver.findElement(By.name("lastname")).sendKeys("S");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select setday = new Select(day);
		
		setday.selectByVisibleText("14");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select setmonth = new Select(month);
		
		setmonth.selectByValue("6");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select SetYear = new Select(year);
		
		SetYear.selectByIndex(25);
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("newteastleafdemo@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("@werAS@1233&");
		
		driver.findElement(By.name("websubmit")).click();

		driver.close();
		
		
		
		
		

	}

}
