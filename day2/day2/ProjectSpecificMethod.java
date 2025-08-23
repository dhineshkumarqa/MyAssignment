package week5.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ProjectSpecificMethod extends BaseClass {
	@Test
	public void Mainmethod() throws InterruptedException
	{
		//Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//span[text()='App Launcher']/preceding-sibling::div[1]")).click();
		
		//Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		
		//Click on the Dropdown icon in the legal Entities tab
		driver.findElement(By.xpath("//span[text()='Legal Entities']/following::a[1]/lightning-icon")).click();
		
		//Click on New Legal Entity
		Thread.sleep(10);
		WebElement element2 = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		js.executeScript("arguments[0].click()", element2);
		
		//Enter the Company name as 'TestLeaf'. 
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		
		//Enter Description as 'Salesforces'.
		driver.findElement(By.xpath("//label[text()='Description']/following::textarea")).sendKeys("Salesforces");
		
		//Select Status as 'Active'
		WebElement element3 = driver.findElement(By.xpath("//span[text()='--None--']"));
		js.executeScript("arguments[0].scrollIntoView()", element3);
		element3.click();
		WebElement element4 = driver.findElement(By.xpath("//span[text()='Active'][1]"));
		js.executeScript("arguments[0].click()", element4);
		
		//Click on Save 
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		//Verify the Alert message (Complete this field) displayed for Name
		String text = driver
				.findElement(By.xpath("//div[@class='slds-form-element__help' and contains(.,'Complete this field.')]"))
				.getText();
		if (text.contains("Complete this field.")) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test case failed");
		}

	}

}
