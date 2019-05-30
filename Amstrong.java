import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		s.close();
		int num1=num;
		double rem=0;
		int n=num%10;
		while(n>0) {
			n=num%10;
			num=num/10;
			rem=rem+Math.pow(n, 3);
		}
		if(rem==num1)
			System.out.println("amstrong number");
		else
			System.out.println("not an amstrong number");
	}

}
