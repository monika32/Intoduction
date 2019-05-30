import java.util.Scanner;
public class Discount {
	public static void calculate(float cost,float discount) {
		float total=0;
		total=cost*discount/100;
		System.out.println("total dicount is:"+total);
		System.out.println("amount is:"+(cost-total));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter cost and discount rate");
		int cost=s.nextInt();
		int discount=s.nextInt();
		s.close();
		calculate(cost,discount);
	}

}
