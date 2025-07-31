package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {


      ChromeOptions options = new ChromeOptions();

      options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

      driver.get("http://leaftaps.com/opentaps/control/main");

      driver.manage().window().maximize();

 

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));

 

      driver.findElement(By.id("username")).sendKeys("DemoCSR");

 

      driver.findElement(By.id("password")).sendKeys("crmsfa");

 

      driver.findElement(By.className("decorativeSubmit")).click();

 

      driver.findElement(By.linkText("CRM/SFA")).click();

 

      driver.findElement(By.linkText("Accounts")).click();

 

      driver.findElement(By.linkText("Create Account")).click();

 

      driver.findElement(By.id("accountName")).sendKeys("Dhinesh New Selenium Learining1");

 

      driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

 

       WebElement industry = driver.findElement(By.name("industryEnumId"));

 
       Select computerscience = new Select(industry);

 

       computerscience.selectByVisibleText("Computer Software");

       WebElement ownership = driver.findElement(By.name("ownershipEnumId"));

       Select SCorporation = new Select(ownership);

       SCorporation.selectByVisibleText("S-Corporation");

       WebElement source = driver.findElement(By.id("dataSourceId"));

       Select Employee = new Select(source);

       Employee.selectByValue("LEAD_EMPLOYEE");


       WebElement MarketingCampaign = driver.findElement(By.name("marketingCampaignId"));

       Select eCommerce = new Select(MarketingCampaign);

       eCommerce.selectByIndex(5);

       WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));

       Select texas = new Select(state);

       texas.selectByValue("TX");

       driver.findElement(By.className("smallSubmit")).click();

       String name = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();

       if (name.contains("Dhinesh New Selenium Learining1")) {

       System.out.println("The account name is diaplayed correctly");

       } 
       else {

       System.out.println("account name doesn't match");

       }
 

      driver.quit();

   }

}