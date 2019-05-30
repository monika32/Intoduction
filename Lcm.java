import java.util.Scanner;
public class Lcm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers: ");
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		int res=0;
		int i=2;
		if(a>b)
			res=a;
		else
			res=b;
		int temp=res;
		while((res%a!=0) || (res%b!=0)) {
			res=temp*i;
			i++;
		}
		System.out.println("lcm is : "+res);
	}

}
