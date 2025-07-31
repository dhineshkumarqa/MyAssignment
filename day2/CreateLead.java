
package week2.day2;

import java.time.Duration;

 

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

 

public class CreateLead {

 

public static void main(String[] args) {

 

                              ChromeOptions options = new ChromeOptions();

 

                              options.addArguments("guest");

 

                              ChromeDriver driver = new ChromeDriver(options);

 

                              driver.get("http://leaftaps.com/opentaps/");

 

                              driver.manage().window().maximize();

 

                              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));

 

                              driver.findElement(By.id("username")).sendKeys("DemoCSR");

 

                              driver.findElement(By.id("password")).sendKeys("crmsfa");

 

                              driver.findElement(By.className("decorativeSubmit")).click();

 

                              driver.findElement(By.linkText("CRM/SFA")).click();

 

                              driver.findElement(By.linkText("Leads")).click();

 

                              driver.findElement(By.linkText("Create Lead")).click();

 

                      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini");

 

                        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhineshkumar");

 

                              driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");

 

                              driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Learning Selenium");

 

                              driver.findElement(By.name("submitButton")).click();

 

                              String Titleof = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();

 

                              if (Titleof.equals("Learning Selenium")) {

                                             System.out.println("The title matches perfectly");

                              } else {

                                             System.out.println("The title doesn't match");

                              }

 

                              driver.quit();

               }

 

}