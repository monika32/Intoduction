
public class Area {
	
	 public void triangleArea(double base,double height) {
		 double area=(0.5*base*height);
		 System.out.println("Area of triangle is :"+area);
	}
	 public void circleArea(double radius) {
		double area=(3.14*radius*radius);
		System.out.println("Area of circle is :"+area);
		System.out.println("circle perimeter is :"+(2*3.14*radius));
	}
	 public void isocelecsTriangleArea(double base,double height) {
			double area=(0.5*base*height);
			System.out.println("Area of triangle is :"+area);
		}
	
	public void rectangleArea(double length, double breadth) {
		 double area=(length*breadth);
			System.out.println("Area of rectangle is :"+area);
			System.out.println("Perimeter of rectangle is :"+(2*(length+breadth)));
	}
	public void paralellogramArea(double base2, double perheight) {
		 double area=(perheight*base2);
			System.out.println("Area of paralellogram is :"+area);
			System.out.println("Perimeter of paralellogram is :"+(2*(base2+perheight)));
	}
	 public void rohmbusArea(double diag1,double diag2) {
			double area=(0.5*diag1*diag2);
			System.out.println("Area of rhombus is :"+area);
			System.out.println("Perimeter of rhombus is :"+(2*(Math.sqrt((diag1*diag1)+(diag2*diag2)))));
		}
	public void equitriangleArea(double base3) {
		 double a=Math.sqrt(3);
			double area=((a/4)*(base3*base3));
			System.out.println("Area of equilateral triangle is :"+area);
			System.out.println("Perimeter of equilateral triangle is :"+3*area);
			
		}
	public void SquareArea(double side) {
		double area=side*side;
		System.out.println("Square of circle is :"+area);
		System.out.println("Square perimeter is :"+4*side);
	}
	public void periCone(double radius,double height) {
		System.out.println("volume of cone is"+(3.14*radius*radius*height)/3);
	}
	public void volPrism(double base,double height) {
		System.out.println("volume of prism is"+(base*height));
	}
	public void cylinder(double radius,double height) {
		System.out.println("volume of cylinder is"+(3.14*radius*radius*height));
		System.out.println("Total Surfce Area of Cylinder is :"+(2*3.14*radius*(height+radius)));
	}
	public void sphere(double radius) {
		System.out.println("volume of sphere is"+((4/3)*radius*radius*radius));
	}
	public void cube(double side) {
		System.out.println("curved surface area of cube is :"+4*side*side);
	}
	 

}
