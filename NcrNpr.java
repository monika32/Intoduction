import java.util.Scanner;
public class NcrNpr {
	public static int fact(int num) {
		int res=1;
		for(int i=1;i<=num;i++)
			res=res*i;
		return res;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n and r value:");
		int n=s.nextInt();
		int r= s.nextInt();
		s.close();
		int n1=fact(n);
		int n2=fact(n-r);
		int n3=fact(r);
		System.out.println("ncr: "+(n1/(n2*n3)));
		System.out.println("nPr : "+(n1/n2));
	}

}
