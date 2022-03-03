package Assignment;

import java.util.Scanner;

public class ElectricBill {
	 private String n;
	    private int units;
	    private double bill;
	    
	    public void accept() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter customer name: ");
	        n = in.nextLine();
	        System.out.print("Enter units consumed: ");
	        units = in.nextInt();
	    }
	    
	    public void calculate() {
	        if (units <= 100)
	            bill = units * 2;
	        else if (units <= 300)
	            bill = 200 + (units - 100) * 3;
	        else {
	            double amt = 200 + 600 + (units - 300) * 5;
	            double surcharge = (amt * 2.5) / 100.0;
	            bill = amt + surcharge;
	        }
	    }
	    
	    public void print() {
	        System.out.println("Name of the customer: " + n);
	        System.out.println("Number of units consumed: " + units);
	        System.out.println("Bill amount: " + bill);
	    }
	    
	    public static void main(String args[]) {
	        ElectricBill obj = new ElectricBill();
	        obj.accept();
	        obj.calculate();
	        obj.print();
	    }
	}
