package arrays;

public class ArrayDemo {
	public static void main(String[] args) {
	int arr[];
	arr=new int[3];
	arr[0]=100; arr[1]=200; arr[2]=300;
	
	int[] arr2=new int[3];
	
	
	int arr3[]= {10,20,30};
	for(int x=0; x<arr.length; x++)
			System.out.println(arr[x]);
			
	for(int x: arr3)
		System.out.println(x);

}
}
