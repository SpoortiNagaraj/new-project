package Assignment;

import java.util.Random;

public class GenInnings {
		public static void main(String[] args)   
		{  
		 System.out.println("0s in 5 overs ");  
		int s1=0;
		Random num = new Random();
	        int res;
	 
	    for ( int i = 1; i <= 5; i++ ) {
	       res = 1 + num.nextInt( 1 );
	     
	       System.out.println( res );
	       s1 += res;
	       
	       }
	    System.out.println("\n The sum of 0s are");
	    
	    System.out.println( + s1 );
	    
	    
	    
	    System.out.println("\n 1s in 5 overs ");  
	    int s2=0;
		Random num1 = new Random();
	    int res1;
	    for ( int i = 1; i <= 5; i++ ) {
	       res1 = 1 + num1.nextInt(2 );
	       System.out.printf( "%d ", res1 );
	       s2 += res1;
	    }
	    System.out.println("\n The sum of 1s are");
	    
	    System.out.println( + s2 );
	    
	    
	    System.out.println("\n 2s in 5 overs ");
	    int s3=0;
		Random num2 = new Random();
	    int res2;
	    for ( int i = 1; i <= 5; i++ ) {
	       res2 = 1 + num2.nextInt(2 );
	       System.out.println( res2 );
	       s3 += res2;
	    }
	    
	    System.out.println("\n The sum of 2ss are");
	    
	    System.out.println( + s3 );
	    
	    
	    System.out.println("\n 3s in 5 overs "); 
	    int s4=0;
		Random num3 = new Random();
	    int res3;
	    for ( int i = 1; i <= 5; i++ ) {
	       res3 = 1 + num3.nextInt(2 );
	       s4 += res3;
	       System.out.println( res3 );
	    }
	    System.out.println("\n The sum of 3s are");
	    
	    System.out.println( + s4 );
	    
	   
	    System.out.println("\n 4s in 5 overs ");
	    int s5=0;
		Random num5 = new Random();
	    int res5;
	    for ( int i = 1; i <= 5; i++ ) {
	       res5 = 1 + num5.nextInt(2 );
	       s5 += res5;
	       System.out.println( res5 );
	    }
	    System.out.println("\n The sum of 4s are");
	    
	    System.out.println( + s5 );
	    
	    
	    
	    System.out.println("\n 6s in 5 overs ");  
	    int s6=0;
		Random num6 = new Random();
	    int res6;
	    for ( int i = 1; i <= 5; i++ ) {
	       res6 = 1 + num6.nextInt(2 );
	       s6=res6;
	       System.out.println( res6 );
	    }
	    System.out.println("\n The sum of 6s are");
	    
	    System.out.println( + s6 );
	    
	    
	    System.out.println("Total score of that batsman");
	    int t=s2*1+s3*2+s4*3+s5*4+s6*6;
	    System.out.println( + t );
	    
	    System.out.println("\n STRIKE RATE");

	    int str=(t*100)/30;
	    System.out.println( + str );
	}
	}

