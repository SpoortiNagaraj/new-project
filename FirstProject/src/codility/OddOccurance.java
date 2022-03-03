package codility;

public class OddOccurance {
	public int solution(int[] A) {
		if(A.length<= 0) {
			return -1;
		}
	int unpaired=0;
	for(int i=0;i<A.length;i++) {
		unpaired = A[i];
	}
	return unpaired;
}
}
