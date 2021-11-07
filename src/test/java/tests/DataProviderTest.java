package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	
	@Test(dataProvider = "DP")
	public void dataProviderTest(String firstName, String lastName)
	{
		System.out.print(firstName+"\t");
		System.out.println(lastName);
		
	}
	
	@DataProvider(name = "DP")
	public Object[][] dataMethod()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Gautam";
		data[0][1] = "Varma";
		
		data[1][0] = "Sachin";
		data[1][1] = "Tendulkar";
		
		return data;
	}

}
