
public class CastingDemo {
	public static void main(String[] args) {
		{
			int x=100;
			double y=x;
			System.out.println(x+" "+y);
			
			x=(int)y;
			System.out.println(x+" "+y);
			
			char ch='S';
			int cc=ch;
			System.out.println(cc);
			
			ch=(char) cc;
			System.out.println(ch);
		}
	} 

}
