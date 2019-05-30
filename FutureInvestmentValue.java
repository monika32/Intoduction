import java.util.Scanner;
public class FutureInvestmentValue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter present value intrest and time:");
		double value=s.nextDouble();
		double rate=s.nextDouble();
		double time=s.nextDouble();
		s.close();
		double res=(Math.pow((1+(rate/100)), time));
		double future_value=value*res;
		System.out.println("Future investment value is : "+future_value);
	}

}
