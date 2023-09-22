package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0,n=8,s=1,sum;
		System.out.println(f);
		System.out.println(s);
		for(n=1;n<=8;n++)
		{
		sum=f+s;
		f=s;
		s=sum;
		System.out.println(sum);
	}

		
}
	
}

