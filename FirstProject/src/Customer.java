
public class Customer {
	int custId;
	String custName;
	
	void setData()
	{
		custId=1001;
		custName="spoo";
		
	}
	void display()
	{
		System.out.println("Cust ID:"+custId);
		System.out.println("Cust Name:"+custName);
		
	}
	
	public static void main(String[] args) {
		Customer c=new Customer();
		c.setData();
		c.display();
		}

}
