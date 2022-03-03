package mapdemo;
import java.util.*;
import java.util.Map;

public class Task2 {
	static void characterCount(String inputString)
	{
	Map<Character,Integer> ch = new HashMap<Character, Integer>();
	char[] strArray=inputString.toCharArray();
	for(char c: strArray)
	{
		if(ch.containsKey(c)) {
			ch.put(c,ch.get(c)+1);
		}
		else {
			ch.put(c,1);
		}
	}
	for(Map.Entry entry: ch.entrySet()) {
		System.out.println(entry.getKey() + " "+ entry.getValue());
	}

	}
 public static void main(String[] args)
 {
	 String str="banana";
	 characterCount(str);
 }
}


