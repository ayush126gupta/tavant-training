package day1;

public class markvalidatorswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int mark = 60;
System.out.println(markGrad(80));
	}
	public static String markGrad(int mark)
	{
		
	String gg = null;
	switch(mark/10)
{
       case 10: 
       case 9 :
       gg= "grade a";
       break;
       case 8:      
    	   gg="grade b";
       break;
       case 7: if(mark>75)
    	   gg="grade b";
       else gg="grade c";
       case 6:
    	   gg="grade c";
    	   if(mark==60)
    		   gg="grade d";
       break;
       default:
    	   gg="grade d";
    	  break;
}
return gg;
	}
	
}
