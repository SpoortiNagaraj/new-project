package Exception;
class VerifyCard extends Exception
{

	private static final String message = null;

	void verifyCard(int cardNo) {
		
	}
class VerifyCardNo
{
	void getNo(int No) throws VerifyCard
	{
		if(No<=10)
			throw new VerifyCard();
		System.out.println("Valid CardNo");
	}

	public void getNo(String string) {
		// TODO Auto-generated method stub
		
	}
	}


public class Task {
public static void main(String[] args) throws VerifyCard {
	VerifyCardNo vcn=new VerifyCardNo();
	vcn.getNo("1234567890");
}
}
