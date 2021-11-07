package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathDemo extends baseTest
{

	@Test
	public void xpathDemo()
	{
		driver.get("http://the-internet.herokuapp.com/login");
		
		//enter Username
		driver.findElement(By.xpath("//button[@type='submit']/preceding-sibling::div[2]//input")).sendKeys("tomsmith");

		//enter Password
		driver.findElement(By.xpath("//label[contains(text(),'Password')]/following::input")).sendKeys("SuperSecretPassword!");
	
		
		driver.findElement(By.xpath("//input[@id='username']/ancestor::div//button")).click();
	
	}

}
