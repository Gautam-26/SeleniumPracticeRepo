package com.home.webpages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile 
{
	protected InputStream input = null;
	protected Properties prop = null;
	
	public ReadConfigFile()
	{
		try 
		{
			input = new FileInputStream("./src/test/resources/properties/Config.properties");
			prop = new Properties();
			prop.load(input);
		} 
		catch (FileNotFoundException e) 
		{
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public String getLoginUrl()
	{
		return prop.getProperty("loginUrl");
	}

}
