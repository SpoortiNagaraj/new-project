package codility;

public class FrogSolution {
	public int solution(int X, int Y, int D)
	{
		int distancetojump = Y-X;
		int jumpsRequired = distancetojump / D;
		
		if(distancetojump % D != 0)
		{
			jumpsRequired++;
		}
		return jumpsRequired;
	}

}
