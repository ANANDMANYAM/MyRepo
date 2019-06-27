package JavaCodes;

import java.util.HashMap;
import java.util.Map;

public class WordRemove {

	public static void main(String[] args) {
		
		
		String str = "this is is a java program";
		
		String[] sp = str.split("\\s");
		
		Map<String,Integer> hm = new HashMap<String,Integer>();
		
		for(int i=0;i<sp.length;i++)
		{
			if(hm.containsKey(sp[i]))
			{
				int count =hm.get(sp[i]);
				
				hm.put(sp[i], count+1);
			}
			else
			{
				hm.put(sp[i], 1);
			}
		}
		
		System.out.println(hm);
		
		

	}

}
