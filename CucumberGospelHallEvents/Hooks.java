package myHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import driverSetup.InitializeBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import properties.CallProperties;

public class Hooks {

	 public static WebDriver driver;
	
	@Before
	public void browserSetup()
	{
		Properties prop = CallProperties.intializeProperties();
		driver = InitializeBrowser.getDriver();
		driver = InitializeBrowser.callBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("gospelhallurl"));
	
	}
	@After
	public void tearDown(Scenario scenario) {
		
		String scenarioName = scenario.getName().replaceAll(" ","_");
		
		if(scenario.isFailed()) {
			
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot,"image/png", scenarioName);
		}
		
		driver.quit();
		
	
	}
}
