import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=s.nextInt();
		s.close();
		int c=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				c++;
			}
		if(c==2)
			System.out.println("prime");
		else
			System.out.println("not a prime");
	}

}
