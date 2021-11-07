package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonLoginTest extends baseTest
{

	@Test
	public void amazonLoginTest()
	{

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement signin =	driver.findElement(By.xpath(".//*[@class='nav-a nav-a-2   nav-progressive-attribute'][1]"));

		signin.click();
		
		driver.findElement(By.cssSelector(".a-input-text.a-span12.auth-autofocus.auth-required-field")).sendKeys("9966973477");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.cssSelector("#continue")).sendKeys("AMAZON2606");
		
		driver.findElement(By.cssSelector(".a-button-input")).click();

	}
}
