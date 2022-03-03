package inheritance;

public class String1 {
	public static void main(String[] args) {
		String str = "GeeksforGeeks password is:123";
		int digits=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
				digits++;
		}
		System.out.println("digits are="+digits);
	}
}
