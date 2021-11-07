package tests;

import org.testng.annotations.Test;

import com.home.webpages.LoginPage;

public class loginTest extends baseTest
{
	
	LoginPage objLoginPage;
	
	@Test
	public void launchBrowserTest()
	{	
	
		objLoginPage = new LoginPage(driver);
		objLoginPage.Open();
		objLoginPage.loginWith("tomsmith", "SuperSecretPassword!");
	}

}
