package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) 
	{
		String s = "abcabcdeffgh";
		char k = 0;
		
		Map<Character,Integer> map = new HashMap<>();
		
		char[] ch = s.toCharArray();
		
		for(char c : ch)
		{
			if(map.get(c) == null)
			{
				map.put(c, 1);
			}
			else
			{
				map.put(c,map.get(c)+1);
			}
		}
		
		for(char c : ch)
		{
			if(map.get(c) == 1)
			{
				k = c;
				break;
			}
				
		}
		
		System.out.println(k);
		

	}

}
