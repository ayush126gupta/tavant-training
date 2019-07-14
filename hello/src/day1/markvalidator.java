package day1;

public class markvalidator {

	//private static int aa;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String aa = (markGrade(68));;
		System.out.println(isPass(68));
    System.out.println(aa);
	}
public static boolean isPass(int mark) {
	if (mark>=40)
	return true;
	else 
		return false;
	
}	
public static String markGrade (int mark) 
{if(isPass(mark))
{	if (mark>90)
			System.out.println("Grade A");
		else if(mark>75 && mark<90)
			System.out.println("Grade B");
		else if(mark>60 && mark<75)
			System.out.println("Grade C");
}
		else 
			System.out.println("Grade D");
return null;
//return 0;
		
	}
}

