package day1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class Launch {
	static FirefoxDriver driver=null;
	@BeforeSuite
	public void setup()
	{
		 driver.get("http://newtours.demoaut.com");
		 driver.manage().window().maximize();	
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
}
