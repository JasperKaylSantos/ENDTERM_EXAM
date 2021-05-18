public abstract class Account
{
	protected int accountNumber;
	protected double balance;
	
	public Account(int acctNum)
	{
		accountNumber = acctNum;
		setBalance(100000);
	}
	
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public abstract int getAccountNumber();
	public abstract double getBalance();
	
	public abstract String getAccountInfo();
}