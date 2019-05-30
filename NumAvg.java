import java.util.Scanner;
public class NumAvg {
	public static void avg(double num) {
		double average=0;
		double n=num;
		for(int i=1;i<=num;i++) {
			average=average+i;
		}
		System.out.println("average is:"+(average/n));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to calculate average:");
		double num=s.nextDouble();
		s.close();
		avg(num);
	}

}
