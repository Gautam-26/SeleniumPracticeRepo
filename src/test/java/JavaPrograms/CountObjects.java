package JavaPrograms;

public class CountObjects {

	public static void main(String[] args) 
	{
		String s1= "Gautam";
		String s2= "Varma";
		String s3 = s1+s2;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

	}

}
