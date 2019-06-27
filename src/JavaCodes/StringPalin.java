package JavaCodes;

public class StringPalin {

	public static void main(String[] args) {
		
    	String str = "madam";
		
		String str1 = "";
		
		int size = str.length();
		
		System.out.println(size);
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
		   str1 = str1+str.charAt(i);
			
		}
		
		System.out.println(str1);
		
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("this is palindrome");
		}
		else
		{
			System.out.println("this is not palindrome");
		}
	} 

}
