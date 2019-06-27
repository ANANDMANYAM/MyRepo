package JavaCodes;

import java.util.Arrays;

public class ArrayElement {

	public static void main(String[] args) {
		
	int[] arr = {11,12,34,5,4,67};
	
	System.out.println(arr.length);
		
	Arrays.sort(arr);
	
	for(int i=0;i<arr.length;i++)
	{
		if(i==0)
		{
			System.out.println("first smallest element:"+arr[i]);
		}
		
		else if(i==1)
		{
			System.out.println("second smallest element:"+arr[i]);
		}
	}
		
		
		
		
		
		
		
		
	}
	
	

}
