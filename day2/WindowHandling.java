package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// login

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Merge Contacts")).click();

		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::img[1]")).click();

		Set<String> windowHandle = driver.getWindowHandles();

		System.out.println(windowHandle);

		List<String> window1 = new ArrayList<>(windowHandle);

		driver.switchTo().window(window1.get(1));

		driver.findElement(By.linkText("FrenchCustomer")).click();

		// driver.switchTo().defaultContent();

		driver.switchTo().window(window1.get(0));

		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::img[2]")).click();

		Set<String> windowHandle1 = driver.getWindowHandles();

		System.out.println(windowHandle1);

		List<String> window2 = new ArrayList<>(windowHandle1);

		driver.switchTo().window(window2.get(1));

		driver.findElement(By.linkText("FrenchCustomer")).click();

		// driver.switchTo().defaultContent();
		driver.switchTo().window(window2.get(0));

		driver.findElement(By.linkText("Merge")).click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		String title = driver.getTitle();

		System.out.println(title);

		if (title.equals("Merge Contacts | opentaps CRM")) {
			System.out.println("the page titleis get verified");
		} else {
			System.out.println("the page title is not get verified");
		}

	}

}
