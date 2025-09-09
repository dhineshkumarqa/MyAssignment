package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods
{
	public CreateLeadPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public CreateLeadPage enterCompanyName(String Cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
        return this;
	}
	
public CreateLeadPage enterFirstname(String fname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
    return this;
	}

public CreateLeadPage enterLastname(String Lname) {
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
	return this;
}

public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);

}

}
