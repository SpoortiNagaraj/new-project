package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Emp {
	public static void main(String[] args) {
		int num=5;
		Scanner sc=new Scanner(System.in);
		ArrayList<Emp> myArray=new ArrayList<Emp>();
		int count=0;
		while(count<num) {
			System.out.println("Enter the empid and name: ");
			
			String empDetails = sc.nextLine();
			Emp e=new Emp();
			String[] splited=empDetails.split(" ");
			e.setempid(Integer.parseInt(splited[0]));
			e.setname(splited[1]);
			myArray.add(e);
			count++;
			
		}
		sc.close();
		
		for(Emp e:myArray) {
			System.out.println("empId is: "+e.getempid()+ "name is: "+e.getname());
			
		}
	}

	private String getname() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getempid() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setname(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setempid(int parseInt) {
		// TODO Auto-generated method stub
		
	}

}
