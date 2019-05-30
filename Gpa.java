import java.util.Scanner;
public class Gpa {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 6 subjects marks:");
		double a[]=new double[6];
		for(int i=0;i<6;i++) {
			a[i]=s.nextDouble();
			a[i]=a[i]/10;
		}
		s.close();
		double sum=0;
		for(int j=0;j<6;j++) {
			sum=sum+a[j];
		}
		double res=sum/6;
		System.out.println("gpa scored is :"+res);
	}

}
