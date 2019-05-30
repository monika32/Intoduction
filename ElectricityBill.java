import java.util.Scanner;
public class ElectricityBill {
	public static void calculateBill(int watt) {
		int res=(watt*24*30*7/1000);
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter no of kilowatts used:");
		int watt=s.nextInt();
		System.out.println("the electricity bill for this month is :");
		calculateBill(watt);
		s.close();
	}

}
