package rough;

import org.testng.annotations.Test;

public class TestngPriorityDemo 
{
	
	@Test(groups = "Functional",priority = 1)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups = "Regression",priority = 2)
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups = "Functional",priority = 3)
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(groups = "Regression",priority = 4)
	public void test4()
	{
		System.out.println("test4");
	}
	
	@Test(groups = "smoke",priority = 0)
	public void test5()
	{
		System.out.println("test5");
	}

}
