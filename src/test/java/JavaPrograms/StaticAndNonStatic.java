package JavaPrograms;

public class StaticAndNonStatic 
{
	

	public static void main(String[] args) 
	{
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.subtraction(100,30);
		
		StaticAndNonStatic.subtraction(100, 10, 20);
		
		try
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Arithmetic Exception");
		}

	}
	
	public void subtraction(int num1, int num2) {
        System.out.println(num1 - num2);
    }
 
    public static void subtraction(int num1, int num2, int num3) {
        System.out.println(num1 - num2 - num3);
    }

}
