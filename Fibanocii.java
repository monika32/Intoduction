import java.util.Scanner;
public class Fibanocii {
	public static void fib(int range) {
		int num=0;
		int num1=1;
		int num2=0;
		System.out.print(num+ "  ");
		System.out.print(num1+ "  ");
		for(int i=0;i<range-2;i++){
			num2=num1+num;
			num=num1;
			num1=num2;
			System.out.print(num1+ "  ");
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter number of elements to be printed:");
		int range=s.nextInt();
		s.close();
		fib(range);
	}

}
