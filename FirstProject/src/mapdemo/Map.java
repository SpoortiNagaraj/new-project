package mapdemo;
import java.util.*;
import java.util.Map.Entry;

public class Map {
	public static void main(String[] args) {
		HashMap<String, Integer> fps = new HashMap<String, Integer>();
		fps.put("Apple",240);
		fps.put("grape",190);
		fps.put("Orange",55);
		System.out.println(fps);
		System.out.println(fps.containsKey("Apple"));
		System.out.println(fps.containsValue(120));
		System.out.println(fps.get("Apple"));
		
		Set<String> keys=fps.keySet();
		System.out.println(keys);
		
		Collection<Integer> vals=fps.values();
		System.out.println(vals);
		
		fps.remove("Orange");
		System.out.println(fps);
		
		for(Entry<String, Integer> ss : fps.entrySet())
		{
			System.out.println(ss.getKey());
			System.out.println(ss.getValue());
		}
	}

	public Object entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
