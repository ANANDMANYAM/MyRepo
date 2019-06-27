package JavaCodes;

public class StringFrequency {

	public static void main(String[] args) {
		
		
		String str = "bangalore is a it hub";
		
		char[] ch = str.toCharArray();
		
		int size = ch.length;
		
		for(int i=0;i<size;i++)
		{
			int count = 0;
			for(int j=0;j<size;j++)
			{
				if(j<i & ch[i]==ch[j])
				{
					break;
				}
				if(ch[j]==ch[i])
				{
					count++;
				}
				if(j==size-1)
				{
					System.out.println(ch[i]+"    "+count);
				}
			}
		}

	}

}
