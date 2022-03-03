package codility;

public class CyclicRotation {
	public int[] solution (int[] A, int K)
			{
		if(A.length == 0)
		{
			return A;
		}
		int i;
		while(K > 0)
		{
			int temp = A[A.length];
			for(i=A.length-1; i>0;i--)
			{
				A[i]=A[i-1];
			}
			A[i] = temp;
			K--;
		}
		return A;
			}
		
			}
	