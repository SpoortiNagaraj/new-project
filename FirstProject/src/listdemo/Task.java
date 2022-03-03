package listdemo;

import java.util.ArrayList;
import java.util.List;


public class Task {
	void problem1(String names[])
	{
		List obj = new ArrayList();
	
		for(int i=0;i<names.length;i++) {
			obj.add(names[i].toUpperCase());
		}
		System.out.println(obj);
	}
	
public static void main(String[] args) {
	String names[]= {"apple","smsung","oppo","vivo"};
new Task().problem1(names);
	}
}

