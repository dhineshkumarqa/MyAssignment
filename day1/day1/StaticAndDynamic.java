package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StaticAndDynamic extends BaseClass
{

	
	  @Test(priority = 1) public void StaticParamterization() {
	  
	  driver.findElement(By.
	  xpath("//span[text()='App Launcher']/preceding-sibling::div[1]")).click();
	  
	  driver.findElement(By.xpath("//button[text()='View All']")).click();
	  WebElement element =
	  driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView()", element); 
	  element.click();
	  
	  //Click on the Dropdown icon in the legal Entities tab 
	  driver.findElement(By.xpath("//span[text()='Legal Entities']/following::a[1]/lightning-icon")).click();
	  
	  //Click on New Legal Entity 
	  WebElement element2 =  driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
	  js.executeScript("arguments[0].click()", element2);
	  
	  //Enter the Company name as 'TestLeaf'.
	  driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(
	  "TestLeaf");
	  
	  //Enter Description as 'Salesforces'. 
	  driver.findElement(By.xpath(
	  "//label[text()='Description']/following::textarea")).sendKeys("Salesforces")
	  ;
	  
	  //Select Status as 'Active'
	  WebElement element3 = driver.findElement(By.xpath("//span[text()='--None--']"));
	  js.executeScript("arguments[0].scrollIntoView()", element3);
	  element3.click(); WebElement element4 =
	  driver.findElement(By.xpath("//span[text()='Active'][1]"));
	  js.executeScript("arguments[0].click()", element4);
	  
	  //Click on Save
	  driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	  
	  //Verify the Alert message (Complete this field) displayed for Name 
	  String  text = driver.findElement(By.
	  xpath("//div[@class='slds-form-element__help' and contains(.,'Complete this field.')]"
	  )).getText(); if (text.contains("Complete this field.")) {
	  System.out.println("Test Case Passed"); } else {
	  System.out.println("Test case failed"); }
	  
	  }
	 

	@DataProvider
	public String[][] Datasend()
	{
		String[][] data = new String[2][1];
		data[0][0] = "Dhinesh Kumar";
		
		data[1][0] = "Abi";
		return data;
		
		
	}
	@Test(priority = 1,dataProvider = "Datasend")
	public void DynamicParameterization(String name) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='App Launcher']/preceding-sibling::div[1]")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Thread.sleep(10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		element.click();
		
		//Click on the Dropdown icon in the legal Entities tab
		driver.findElement(By.xpath("//span[text()='Legal Entities']/following::a[1]/lightning-icon")).click();
		
		//Click on New Legal Entity
		WebElement element2 = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
	    js.executeScript("arguments[0].click()", element2);
	    
	    driver.findElement(By.xpath("//input[@class='slds-input' and @name='Name']")).sendKeys(name);
	    String text = driver.findElement(By.xpath("//input[@class='slds-input' and @name='Name']")).getAttribute("value");
	    Thread.sleep(10);
        if(text.equals(name))
        {
        	System.out.println("Test case is passed");        	
        }
        else
        {
        	System.out.println("Test case Failed");
        }
	
	}
	
}
