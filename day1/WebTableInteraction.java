package week5.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WebTableInteraction {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);

		driver.get("https://erail.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions action = new Actions(driver);

		driver.findElement(By.id("txtStationFrom")).clear();

		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");

		action.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.id("txtStationTo")).clear();

		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");

		action.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.id("chkSelectDateOnly")).click();

		WebElement elements = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody"));

		List<WebElement> elements2 = elements.findElements(By.tagName("tr"));

		int size = elements2.size();
		System.out.println(size);

		List<WebElement> column = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr/td[2]"));

		Set<String> duplicatevalues = new HashSet<>();
		Set<String> Uniquesvalues = new HashSet<>();

		for (int i = 0; i < column.size(); i++) {
			String text = column.get(i).getText();
          if(!Uniquesvalues.add(text))
          {
        	  duplicatevalues.add(text);
          }
		}
		System.out.println("\nPrint the Uniques values :");
		System.out.println(Uniquesvalues);
		System.out.println("\nPrint the Duplicate values :");
		System.out.println(duplicatevalues);

       driver.quit();
	}

}
