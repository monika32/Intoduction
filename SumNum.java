import java.util.Scanner;
public class SumNum {
	public static void avg(double num) {
		double average=0;
		for(int i=1;i<=num;i++) {
			average=average+i;
		}
		System.out.println("average is:"+(average));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to calculate first numbers sum:");
		double num=s.nextDouble();
		avg(num);
		s.close();
	}

}
