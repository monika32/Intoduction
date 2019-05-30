import java.util.Scanner;
public class Depreciation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter asset cost,residual value and life time of the asset");
		double cost=s.nextDouble();
		double value=s.nextDouble();
		double time=s.nextDouble();
		double res=((cost-value)/time);
		System.out.println("total depreciation expense: "+res);
		s.close();
	}

}
