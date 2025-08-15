package week4.day1;

import java.util.ArrayList;

import java.util.List;

public class Intersection {

	public static void main(String[] args)
	{
		int arr1[] =  {3, 2, 11, 4, 6, 7};
		int arr2[] =  {1, 2, 8, 4, 9, 7};
		
	  List<Integer> List1 = new ArrayList<>();
	  List<Integer> List2 = new ArrayList<>();
	  
	  for(int i=0;i<arr1.length;i++)
	  {
		   List1.add(arr1[i]);
	  }
	  
	  for(int j =0;j<arr2.length;j++)
	  {
		  List2.add(arr2[j]);
	  }
	  
	  for(int a=0;a<List1.size();a++)
	  {
		  for(int b=0;b<List1.size();b++)
		  {
			  if(List1.get(a).equals(List2.get(b)))
			  {
				  System.out.println("match found "+List1.get(a));
			  }
		  }
	  }
	  

	}

}
