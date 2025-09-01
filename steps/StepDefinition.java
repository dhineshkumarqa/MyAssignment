package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public WebDriver driver;

	@Given("Launch the browser")
	public void launch_the_browser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");
		driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("enter the username vidyar@testleaf.com")
	public void enter_the_username_vidyar_testleaf_com() {
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
	}

	@And("enter the password Sales@{int}")
	public void enter_the_password_sales(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("Sales@123");
	}

	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}

	@And("click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
		driver.findElement(By.xpath("//span[text()='App Launcher']/preceding-sibling::div[1]")).click();
	}

	@And("click on view All and click Sales App Launcher")
	public void click_on_view_all_and_click_sales_app_launcher() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@And("click on Accounts tab")
	public void click_on_accounts_tab() {
	 WebElement account = driver.findElement(By.xpath("//a[@title='Accounts']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", account);
       
	}

	@And("click on new button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@And("Enter Dhinesh kumar as Account name")
	public void enter_dhinesh_kumar_as_account_name() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Dhinesh kumar");
	}

	@And("select Ownership as public")
	public void select_ownership_as_public() {
		driver.findElement(By.xpath("//label[text()='Ownership']/following::button[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//lightning-base-combobox/following::span[text()='Public'][1]")));
        until.click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("click save and verify Account name")
	public void click_save_and_verify_account_name() {
		String AccountName = driver.findElement(By.xpath("//slot[@name='primaryField']//lightning-formatted-text")).getText();
		if(AccountName.equals("Dhinesh kumar"))
		{
			System.out.println("The Account name is present and Testcase is passed");
		}
		else
		{
			System.out.println("Account is not present and  Testcase is Failed");
		}

	}

}
