import java.util.Scanner;
public class Power {
	public static void calculate(double num,double power) {
		double res=1;
		for(int i=0;i<power;i++) {
			res=num*res;
		}
		System.out.println("power is:"+res);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				System.out.println("enter number and power:");
				double num=s.nextDouble();
				double power=s.nextDouble();
				calculate(num,power);
				s.close();
						

	}

}
