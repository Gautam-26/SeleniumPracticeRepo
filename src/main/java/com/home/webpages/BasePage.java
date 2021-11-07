package com.home.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	protected WebDriver driver;
	protected ReadConfigFile readConfig = new ReadConfigFile();
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

}
