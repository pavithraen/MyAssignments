//overriding example
package Assignments;

public class BankInfo extends AxisBank {
	public void saving()
	{
		System.out.println("savings account");
	}
	public void fixed()
	{
		System.out.println("fixed account");	
	}
	public void deposit()
	{
		super.deposit();
		System.out.println("deposit account");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo in=new BankInfo();
		in.saving();
		in.fixed();
		in.deposit();

	}
}

