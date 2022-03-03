package sets;

import java.util.HashSet;
import java.util.Set;

public class SetDemos {
	public static void main(String[] args) {
		Set obj=new HashSet();
		obj.add("Siri");
		obj.add(100);
		obj.add(null);
		obj.add("jack");
		System.out.println(obj);
	}

}
