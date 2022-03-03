package Assignment;

import java.util.Random;
import java.util.Scanner;

public class Fiveinnings {
	public static void main(String[] args)   
	{  
	 
	  
	 
	System.out.println("0s in 5 overs ");  
	int s1=0;
	Random num = new Random();
    int res;
 
    for ( int i = 1; i <= 5; i++ ) {
       res = 1 + num.nextInt( 1 );
     
       System.out.printf( "%d ", res );
       s1 += res;
       
       }
    System.out.println("\n The sum of 0s are");
    
    System.out.printf( "%d",+ s1 );
    
    
    
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
    
    System.out.printf( "%d",+ s2 );
    
    
    System.out.println("\n 2s in 5 overs ");
    int s3=0;
	Random num2 = new Random();
    int res2;
    for ( int i = 1; i <= 5; i++ ) {
       res2 = 1 + num2.nextInt(2 );
       System.out.printf( "%d ", res2 );
       s3 += res2;
    }
    
    System.out.println("\n The sum of 2ss are");
    
    System.out.printf( "%d",+ s3 );
    
    
    System.out.println("\n 3s in 5 overs "); 
    int s4=0;
	Random num3 = new Random();
    int res3;
    for ( int i = 1; i <= 5; i++ ) {
       res3 = 1 + num3.nextInt(2 );
       s4 += res3;
       System.out.printf( "%d ", res3 );
    }
    System.out.println("\n The sum of 3s are");
    
    System.out.printf( "%d",+ s4 );
    
   
    System.out.println("\n 4s in 5 overs ");
    int s5=0;
	Random num5 = new Random();
    int res5;
    for ( int i = 1; i <= 5; i++ ) {
       res5 = 1 + num5.nextInt(2 );
       s5 += res5;
       System.out.printf( "%d ", res5 );
    }
    System.out.println("\n The sum of 4s are");
    
    System.out.printf( "%d",+ s5 );
    
    
    
    System.out.println("\n 6s in 5 overs ");  
    int s6=0;
	Random num6 = new Random();
    int res6;
    for ( int i = 1; i <= 5; i++ ) {
       res6 = 1 + num6.nextInt(2 );
       s6=res6;
       System.out.printf( "%d ", res6 );
    }
    System.out.println("\n The sum of 6s are");
    
    System.out.printf( "%d",+ s6 );
    
    
    System.out.println("Total score of that batsman");
    int t=s2*1+s3*2+s4*3+s5*4+s6*6;
    System.out.printf( "%d",+ t );
    
    System.out.println("\n STRIKE RATE");

    int str=(t*100)/30;
    System.out.printf( "%d",+ str );
    
    int s=0,avg;
    int[] array = new int[10];  
    System.out.println("Enter the scores of last five matches ");  
    for(int i=0; i<6; i++)  
    {  
    Scanner sc=new Scanner(System.in);    
    array[i]=sc.nextInt(); 
    s += array[i];
    avg=s/5;
    } 
    
    int a1=0,a2=0,a3=0,a4=0,a5=0,tt=0;
    int[] array1 = new int[10];  
    System.out.println("\n Enter the number of 0s then 1s , 2s 3s 4s and 6s ");  
    for(int i=0; i<4; i++)  
    {  
    Scanner sc=new Scanner(System.in);    
    array1[i]=sc.nextInt(); 
    a1=array[1]*1;
    a2=array1[2]*2;
    a3=array1[3]*3;
    a4=array1[4]*4;
    a5=array1[5]*6;
    tt=a1+a2+a3+a4+a5;
   
    } 
    
    System.out.println("\n Total runs");
    
    System.out.printf( "%d",+ tt );
    int avstr=(tt/180)*100;
    System.out.println("\n Average Strike rate is :");
    System.out.printf( "%d",+ avstr );
    
	}  
}
