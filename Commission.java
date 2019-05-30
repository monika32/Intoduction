import java.util.Scanner;
public class Commission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your sales amount and commision rate:");
		double amount=s.nextDouble();
		double rate=s.nextDouble();
		double commision=((rate/100)*amount);
		System.out.println("Commision amount is :"+commision);
		s.close();
	}

}
