import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER YEAR TO CHECK LEAP YEAR OR NOT");
		int year=s.nextInt();
		s.close();
		if(year%4==0 && year%100==0 && year%400==0) {
			System.out.println("leap year");
		}else
			System.out.println("not a leap year");
	}

}
