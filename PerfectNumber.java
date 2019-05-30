import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=s.nextInt();
		s.close();
		int res=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				res=res+i;
			}
		}
		if(res==num)
			System.out.println("perfect number");
		else
			System.out.println("not a perfect number");

	}

}
