import java.util.Scanner;
public class Hcf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a nd b values to compute hcf:");
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		int hcf=0;
		int i=1;
		while(i<=a || i<=b) {
			if(a%i==0 && b%i==0)
				hcf=i;
			i++;
		}
		System.out.println("hcf is: "+hcf);
	}

}
