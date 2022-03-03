
public class Caluclator {
	int x;
	int y;
	int z;
	
	void setValues()
	{
	x=20;
	y=30;

}
	void addNums()
	{
	z= x+y;
	}
	
	void display() {
		System.out.println("Result is:"+z);
	}
public static void main(String[] args) {
	Caluclator c = new Caluclator();
	c.setValues();
	c.addNums();
	c.display();
}
}