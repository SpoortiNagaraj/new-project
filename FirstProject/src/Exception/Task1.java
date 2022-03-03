package Exception;

import java.awt.List;
import java.util.ArrayList;

public class Task1 {
public static void main(String[] args) {
	ArrayList obj=new ArrayList();
	obj.add(100);
	obj.add(200);
	obj.add(0,300);
	
	ArrayList obj2=new ArrayList();
	obj2.add(obj);
	obj2.add(1,obj);
	obj2.clear();
	
	System.out.println(obj2);
	System.out.println(obj.contains(100));
	System.out.println(obj.get(0));
	for(int k=0; k<obj.size();k++)
	{
		System.out.println(obj.get(k));
	}
}
}
