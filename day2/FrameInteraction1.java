package week4.day2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInteraction1 {

	public static void main(String[] args)
	{

         //System.setProperty("webdriver.chrome.driver", "C:/Program Files/Python311/Scripts/chromedriver.exe");
         //WebDriver driver = new ChromeDriver();
     
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
        
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		String text = driver.findElement(By.xpath("//p[text()='Hello Harry Potter! How are you today?']")).getText();
		
		if(text.equals("Hello Harry Potter! How are you today?"))
		{
			System.out.println("the value is matching");
		}
		else
		{
			System.out.println("the value is not matching");
		}

	}

}
