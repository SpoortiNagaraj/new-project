package arrays;

import java.util.Scanner;

public class Fruits {
	public static void main(String[] args) {
		int SIZE = 5;
		String[] fruits= new String[SIZE];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fruits "+SIZE);
		for(int i=0; i<SIZE; i++) { 
			fruits[i] = sc.next();
		}
		System.out.println("The fruits are:");
		for(int i=0;i<SIZE;i++)
		{
			System.out.println(fruits[i]);
		}
	}

}
