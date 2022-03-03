
public class TestStudent {
	private static char[] collegeName;

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.setId(201);
		s.setName("Ram");
		s.setDob(1998);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getDob());
		
		Student1.college();
		System.out.println(collegeName);
		
	
	}
}
	 
