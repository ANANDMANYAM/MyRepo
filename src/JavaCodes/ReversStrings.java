package JavaCodes;

public class ReversStrings {

	public static void main(String[] args) {
		
		String str = "Bangalore";
		
		String str1 = reverse(str);
		
		//System.out.println(str.length());
		
		System.out.println(str1);
	}
	
	static String reverse(String name)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i=name.length()-1;i>=0;i--)
		{
			sb.append(name.charAt(i));
		}
		return sb.toString();
		
	}

}
