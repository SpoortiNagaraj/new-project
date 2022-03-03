import java.util.Scanner;

public class DataFromUser {
	public static void main(String[] args) {
		{
			String name;
			int age;
			System.out.println("enter name and age");
			Scanner sc=new Scanner(System.in);
			name=sc.next();
			age=sc.nextInt();
			System.out.println("Name is " + name);
			System.out.println("Age is " + age);
		}
	}

}
