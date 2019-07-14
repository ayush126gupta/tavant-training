package day1;
public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToCelcius(101));
		System.out.println(convertToFarenheit(202));
	}
public static double convertToFarenheit(double celcius) {
	double fare = 9 * (celcius / 5) + 32;
	return fare;
}
public static double convertToCelcius(double farenheit) {
	double cel = (farenheit - 32)*5/9;
	return cel;
}
	}


