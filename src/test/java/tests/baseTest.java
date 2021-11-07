package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseTest 
{
	protected WebDriver driver;
   
    
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/executables/chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	@AfterTest
	public void tearDown()
	{
		if(driver != null)
		{
			driver.close();
			driver.quit();
		}
	}
}
