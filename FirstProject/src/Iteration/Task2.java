package Iteration;

import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		char[] charArray = new char[] {'m','a','l','a','y','a','l','a','m'};
		//String newString=sortString(charArray);
		//System.out.println(newString);
		//int len=charArray.length;
		//removeDuplicates(charArray,len);
		Arrays.sort(charArray);
		for(char ch: charArray)
		{
			System.out.println(ch);
		}
	}

}