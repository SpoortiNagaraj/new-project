package mapdemo;

import java.util.List;
import java.util.Map.Entry;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.HashMap;

public class Marks {
	List<String> findPassed(HashMap<String,Integer> marks)
	{
		for(Entry<String,Integer> ss : marks.entrySet())
		{
			if(ss.getValue()>70)
			{
				System.out.println(ss.getKey());
			}
			}
		return null;
	}
		 public static void main(String args[])
		 {
			 HashMap<String,Integer> marks = new HashMap<String,Integer>();
			 marks.put("Virat",90);
			 marks.put("rahul",45);
			 marks.put("Arun",35);
			 
			 Marks obj=new Marks();
			 System.out.println(obj.findPassed(marks));
		 }
		 
		
}
