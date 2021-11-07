 package com.home.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID,using = "username")
	private WebElement usernameInput;
	
	@FindBy(how = How.ID, using = "password")
	private WebElement passwordInput;
	
	@FindBy(how = How.XPATH, using = "//button[@type = 'submit']")
	private WebElement loginButton;
	
	
	public void Open()
	{
		System.out.println("readConfig.getLoginUrl()");
		openUrl(readConfig.getLoginUrl());
	}
	
	protected void openUrl(String url)
	{
		System.out.println("Opening Url : "+url);
		driver.get(url);
		System.out.println("Page Opened");
	}
	
	public void loginWith(String Username, String Password)
	{
		
		usernameInput.sendKeys(Username);
		passwordInput.sendKeys(Password);
		loginButton.click();
		
	}
	
	
	

}
