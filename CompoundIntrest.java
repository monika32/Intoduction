import java.util.*;
public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the principle,rate,time:" );
		double principle=s.nextDouble();
		double rate=s.nextDouble();
		double time=s.nextDouble();
		s.close();
		double r=(1+rate/100);
		double res=Math.pow(r, time);
		double amount=principle*res;
		double ci=amount-principle;
		System.out.println("the Compound intrest is :"+ci);
	}

}
