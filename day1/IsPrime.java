package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13;
		boolean flag=true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			flag=false;
			break;
			}
		if(flag==true)
			System.out.println("prime");
		else
			System.out.println("not prime");
}
	
	
}