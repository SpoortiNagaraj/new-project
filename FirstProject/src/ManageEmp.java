
public class ManageEmp {
	public static void main(String[] args) {
		
		Emp e=new Emp();
		e.setPsNo("PS004");
		e.setFirstName("Ram");
		e.setJobTitle("Manager");
		
		System.out.println(e.getPsNo());
		System.out.println(e.getFirstName());
		System.out.println(e.getJobTitle());
		
	}

}
