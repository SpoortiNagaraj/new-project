package Assignment;

public class Account {
	
	private int accountNo;
	private int accountBalance;
	private int accountPassword;
	
	
	
	public Account(int accountNo, int accountBalance, int accountPassword) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
		
	}
	



	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public int getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}


	public int getAccountPassword() {
		return accountPassword;
	}


	public void setAccountPassword(int accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	public void displayAccount() {
		
		System.out.println("Account number : "+getAccountNo());
		System.out.println("Account balance : "+getAccountBalance());
		System.out.println("Account password : "+getAccountPassword());
	}


	public static void main(String[] args) {
	
	Account A=new Account(3654865,2453,2456);
	A.displayAccount();
	
	   
	}

}
