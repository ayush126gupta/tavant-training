package day1;

public class factorial {


	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.out.println(calculatefactorial(5));
	}

	static int calculatefactorial(int n) {
		// TODO Auto-generated method stub
		int a=1;
		for(int i=n;i>0;i--)
		{
			a=a*i;
		}
		return a;
	}

}
