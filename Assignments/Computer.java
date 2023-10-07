//single Inheritance
package Assignments;

public class Computer extends Desktop {
	
	public void computerModel()
	{
		System.out.println("Dell");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c=new Computer();
		c.computerModel();
		c.desktopSize();

	}


}
