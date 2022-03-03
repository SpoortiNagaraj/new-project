package String;

public class Digits {
public static void main(String[] args) {
	int countDigit(long long n);
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			++count;
		}
		return count;
	}
	String str="Sanu123";
	int digits=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)>=48 && str.charAt(i)<=57)
			digits++;
	}
	System.out.println("Sum of digits= "+digits);
}
}
