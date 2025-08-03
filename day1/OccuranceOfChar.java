package week3.day1;

public class OccuranceOfChar {

	public static void main(String[] args) 
	{
		
		String name = "TestLeaf";
		
		int count = 0;
		
		
		char targetvalue = 'e';
		
		char[] strchar = name.toCharArray();
		
		for(int i=0;i<strchar.length;i++)
		{
			if(strchar[i] == targetvalue)
			{
				count++;
			}
		}
		System.out.println( targetvalue + " = " + count);

	}

}
