package day1;

public class sumofnumbers {

	//private static int c;
//	private static Object d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // int start = 0,end = 10,d = 0,c = 0,i=0;
  System.out.println(sumofodd(0,10));
  System.out.println(sumofeven(0,10));
	}

	static int sumofodd(int start, int end) {
		int c=0;
		for(int i = start;i<=end;i++) {
			if(i%2!=0)
				c = c+i;
				
		}
		return c;
		
		
		
	}

	static int sumofeven(int start, int end) {
		int d=0;
		for(int i = start;i<=end;i++) {
			if(i%2==0)
				d = d + i;
				
		}
		return d;
		// TODO Auto-generated method stub
		
	}

	
}
