package Overload;

public class FindMax {

	int max(int x, int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
	double max(double x, double y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
	public static void main(String[] args) {
		FindMax fmax=new FindMax();
		System.out.println(fmax.max(10, 20));
		System.out.println(fmax.max(90.56, 35));
	}
}
