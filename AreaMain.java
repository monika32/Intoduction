import java.util.Scanner;
public class AreaMain {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter circle radius:");
		double radius=s.nextDouble();
		Area a=new Area();
		a.circleArea(radius);
		System.out.println("Enter traingle base and height:");
		double base=s.nextDouble();
		double height=s.nextDouble();
		a.triangleArea(base,height);
		System.out.println("Enter isocelestraingle base and height:");
		double base1=s.nextDouble();
		double height1=s.nextDouble();
		a.isocelecsTriangleArea(base1, height1);
		System.out.println("Enter rectangle length and breadth:");
		double length=s.nextDouble();
		double breadth=s.nextDouble();
		a.rectangleArea(length, breadth);
		System.out.println("Enter paralellogram base and perpenicular height:");
		double base2=s.nextDouble();
		double perheight=s.nextDouble();
		a.paralellogramArea(base2, perheight);
		System.out.println("Enter rohmbus diaonal lenths:");
		double diag1=s.nextDouble();
		double diag2=s.nextDouble();
		a.rohmbusArea(diag1, diag2);
		System.out.println("Enter euilateral traingle base:");
		double base3=s.nextDouble();
		a.equitriangleArea(base3);
		System.out.println("Enter Square side:");
		double side=s.nextDouble();
		a.SquareArea(side);
		System.out.println("Enter cone radius and height:");
		double cr=s.nextDouble();
		double ch=s.nextDouble();
		a.periCone(cr, ch);
		System.out.println("Enter prism base and height:");
		double pb=s.nextDouble();
		double ph=s.nextDouble();
		a.volPrism(pb, ph);
		System.out.println("Enter cylinder radius and height:");
		double cyr=s.nextDouble();
		double cyh=s.nextDouble();
		a.cylinder(cyr, cyh);
		System.out.println("Enter Sphere radius:");
		double spr=s.nextDouble();
		a.sphere(spr);
		System.out.println("Enter cube side:");
		double cua=s.nextDouble();
		a.cube(cua);
		s.close();
	}
}
