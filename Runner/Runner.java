package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\main\\java\\Feature\\Salesforce.feature",glue="steps",monochrome=true,publish=true)
public class Runner extends AbstractTestNGCucumberTests
{
	

}
