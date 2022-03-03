package Exception;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String message){
		super(message);
	}
	}
	class VerifyAge
	{
		void getAge(int age)throws InvalidAgeException
		{
			if(age<18)
				throw new InvalidAgeException("Invalid Age");
			System.out.println("Age verified");
		}
	}

public class UserExceptionDemo {
	public static void main(String[] args)
	{
		VerifyAge obj=new VerifyAge();
		try {
			obj.getAge(22);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}


