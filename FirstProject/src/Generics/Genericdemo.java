package Generics;

import java.util.*;

public class Genericdemo {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		int sum=0;
		for(Object num : numbers)
		{
		sum=sum+Integer.parseInt(num.toString());
		System.out.println(sum);
		}
		}
}

