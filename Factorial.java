import java.util.Scanner;
public class Factorial {
	public static int fact(int num) {
		int res=1;
		for(int i=1;i<=num;i++)
			res=res*i;
		System.out.println("factorial of "+num+ "is " +res);
		return res;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to calculate Factorial:");
		int num=s.nextInt();
		s.close();
		fact(num);
	}

}
