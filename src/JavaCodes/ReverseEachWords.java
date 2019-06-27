package JavaCodes;

public class ReverseEachWords {

	public static void main(String[] args) {
		
		String str = "Bangalore is big city";
		
		String str1 = "";
		
		String[] words = str.split("\\s");
		
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			
			sb.reverse();
			
			str1 = str1+sb.toString()+" ";
			
		}
		
		System.out.println(str1);
	}

}
