import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		System.out.println("addition is:"+(a+b));
	}

}
