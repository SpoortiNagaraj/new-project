package constructor;

public class Product {
	int price,qty,total;
	Product()
	{
		price=100;
		qty=3;
	}
	void findTotal()
	{
		total=price*qty;
	}
	void displayBill()
	{
		System.out.println("Bill Amount is "+total);
	}
	public static void main(String[] args) {
		Product soap=new Product();
		soap.findTotal();
		soap.displayBill();
	}

}
