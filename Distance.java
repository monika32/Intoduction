import java.util.Scanner;
public class Distance {
	public static void calculate(float x1,float y1,float x2,float y2) {
		double t1=0,t2=0,t3=0,res=0;
		t1=((x2-x1)*(x2-x1));
		t2=((y2-y1)*(y2-y1));
		t3=t1+t2;
		res=Math.sqrt(t3);
		System.out.println("diatance is :"+res);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first co-ordinates:");
		float x1=s.nextFloat();
		float y1=s.nextFloat();
		System.out.println("enter second co-ordinates:");
		float x2=s.nextFloat();
		float y2=s.nextFloat();
		calculate(x1,y1,x2,y2);
		s.close();
	}

}
