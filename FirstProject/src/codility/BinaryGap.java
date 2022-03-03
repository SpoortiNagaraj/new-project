package codility;

import java.util.ArrayList;

public class BinaryGap {
	public int solution(int N)
	{
	
String a = Integer.toBinaryString(N);
ArrayList<Integer> w=new ArrayList<Integer>();
for(int i=0; i<a.length();i++)
{
	if(a.charAt(i)=='1')
	{
		w.add(i);
	}
}
ArrayList<Integer> wa = new ArrayList<Integer>();
for(int i=0;i<w.size()-1;i++)
{
	wa.add(Math.abs((w.get(i)-w.get(i+1))));
}
int temp=0;
for(int i=0;i<wa.size();i++)
{
	if(temp<wa.get(i))
		temp=wa.get(i);
}
return temp;
	}


	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		System.out.println(bg.solution(521));
	}

}
 