package JavaCodes;

public class NumberPalin {

	public static void main(String[] args) {
		
		int r,sum=0,temp;
		
		int n= 565;
		
		temp = n;
		
		while(n>0)
		{
			r = n%10;
			
			sum = (sum*10)+r;
			
			n= n/10;
		}
		
		if(sum == temp)
		{
			System.out.println("this number is palindrome");
			
		}
		else
		{
			System.out.println("this number is not palindrome");
		}
		

	}

}
