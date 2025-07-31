package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchTheBrowser {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.close();

	}

}
