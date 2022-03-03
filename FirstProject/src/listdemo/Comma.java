package listdemo;

import java.util.ArrayList;
import java.util.List;



public class Comma {
	private static String commaseparatedlist;

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.add("grape");
		StringBuilder str = new StringBuilder();
		for(String s : list)
		{
			str.append(s).append(" , ");
		}
		commaseparatedlist = null;
		if(commaseparatedlist.length()>0)
			commaseparatedlist=commaseparatedlist.substring(0,commaseparatedlist.length()-1);
		System.out.println("commaseparatedlist");
	}
}