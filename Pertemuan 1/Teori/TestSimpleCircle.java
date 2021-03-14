class SimpleCircle {
	/** The radius of this circle */
	double radius = 1;
	
	/** Construct a circle object */
	SimpleCircle() {
	}
	
	/** Construct a circle object */
	SimpleCircle(double newRadius) {
		radius = newRadius;
	}
	
	/** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	/** Return the perimeter of this circle */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/** Set new radius for this circle */
	void setRadius(double newRadius) {
		radius = newRadius;
	}	
}

public class TestSimpleCircle {
	/** main method */
	public static void main(String[] args) {
		// create the circle with radius 1
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of the circle of radius "
			+ circle1.radius + " is " + circle1.getArea());
			
		// create the circle with radius 25
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("The area of the circle of radius "
			+ circle2.radius + " is " + circle2.getArea());
			
		// create the circle with radius 125
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius "
			+ circle3.radius + " is " + circle3.getArea());
			
		// modify circle radius
		circle2.radius = 100; // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius "
			+ circle2.radius + " is " + circle2.getArea());
	}
}