import java.util.Scanner;

public class Operator {
	
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in );
	        int a, b;
	        char operator;
	        System.out.print("Enter A : ");
	        a=sc.nextInt();
	        System.out.print("Enter B : ");
	        b=sc.nextInt();
	        System.out.print("Enter operator (+, -, *, /)");
	        operator = sc.next().charAt(0);
	        int addition  = a+b;
	        int subtraction  = a-b;
	        int multiplication  = a*b;
	        double division  = a/b;

	        switch(operator)
	        {
	            case '+' :
	            {
	                System.out.print("Total after Addition is : "+addition);
	                break;
	            }
	            case '-' :
	            {
	                System.out.print("Total after Subtraction is : " +subtraction);
	                break;
	            }
	            case '*' :
	            {
	                System.out.print("Total after Multiplication is : "+multiplication);
	                break;
	            }
	            case '/' :
	            {
	                System.out.print("Total after Division is : "+division);
	                break;
	            }
	            default :
	            {
	                System.out.print("Please select proper operator");
	                return;
	            }
	        }
	    }
	}


