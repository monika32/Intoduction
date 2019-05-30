import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter a number: ");
		int num=s.nextInt();
		s.close();
		int n1=1,res=0;
		while(n1>0)
		{
			n1=num%10;
			res=res+n1;
			num=num/10;
		}
		System.out.println("sum of digits is :"+res);
	}
}
