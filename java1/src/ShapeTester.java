
public class ShapeTester {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object
				Circle cir1 = new Circle("Cir One", 3.0);
				Rectangle rec1 = new Rectangle("Rec One", 3.0, 4.0);
				Square sq1 = new Square("Square One", 6.0);
				Cube cu = new Cube("Cube one",6.0,6.0,6.0);
				Sphere sp = new Sphere("Sphere one",6.0,6.0,6.0);
				Cylinder cy = new Cylinder("Cyclinder one", 5.0, 6.0);
				Cone co = new Cone("Cone one", 5.0, 5.0);
				TwoDimensionalShape sq2 = new Square("Square Two", 4.0);
				
				System.out.println("Seven shapes have been created:");

				// print the object properties	
				System.out.println("1." + cir1);
				System.out.printf( "%s's area is %.2f, radius is %.2f\n", 
					cir1.getName(),cir1.getArea(), cir1.getRadius());
				
				System.out.println("2." + rec1);
				System.out.printf( "%s's area is %.2f, width is %.2f, height is %.2f\n", 
					rec1.getName(),rec1.getArea(), rec1.getWidth(), rec1.getHeight());
				
				System.out.println("3." + sq1);
				System.out.printf( "%s's area is %.2f, side is %.2f\n", 
					sq1.getName(), sq1.getArea(), sq1.getSide());
				
				
				System.out.println("4." + cu);
				System.out.printf( "%s's Volume is %.2f\n", 
					cu.getName(),cu.getVolume());
				
				System.out.println("5." + sp);
				System.out.printf( "%s's Volume is %.2f\n", 
					sp.getName(),sp.getVolume());
				
				System.out.println("6." + cy);
				System.out.printf( "%s's Volume is %.2f\n", 
					cy.getName(),cy.getVolume());
				
				System.out.println("7." + co);
				System.out.printf( "%s's Volume is %.2f\n", 
					co.getName(),co.getVolume());
				System.out.println();
				
				// print all circle shape
				System.out.printf("Is %s a TwoDimensionalShape? %s\n",sq1.getName(), sq1 instanceof TwoDimensionalShape);
				System.out.printf("Is %s a Square? %s\n", sq1.getName(), sq1 instanceof Square);
				System.out.printf("Is %s a ThreeDimensionalShape? %s\n",co.getName(), co instanceof ThreeDimensionalShape);
				System.out.printf("Is %s a ThreeDimensionalShape? %s\n",cu.getName(), cu instanceof ThreeDimensionalShape);
				System.out.printf("Is %s a ThreeDimensionalShape? %s\n",cy.getName(), cy instanceof ThreeDimensionalShape);
	}

}


class Shape{
	static final String CLASS_NAME = "Shape";
	
	String getClassName() {
		return CLASS_NAME;
	}
}

class TwoDimensionalShape extends Shape{
	static final String CLASS_NAME = "2D Shape";
	double dimension1;
	double dimension2;
	String name;
	public TwoDimensionalShape(String name, double dimension1, double dimension2) { //셍성자
		this.name = name;
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
	}
	String getName() {   //개터
		return name;
	}
	double getSide() {    //한변의 길이 리턴
		return dimension1;
	}
	public double getDimension1() {   //한변의 길이 리턴
		return dimension1;
	}
	public void setDimension1(double dimension1) {   //한변의 세터
		this.dimension1 = dimension1;
	}
	public double getDimension2() {   //개터
		return dimension2;
	}
	public void setDimension2(double dimension2) {  //새터
		this.dimension2 = dimension2;
	}
	
	@Override
	String getClassName() {
		// TODO Auto-generated method stub
		return super.getClassName();
	}
	double getArea() {
		return 0;
	}
}

class ThreeDimensionalShape extends Shape{
	static final String CLASS_NAME = "3D Shape";
	String name;
	double dimension1;
	double dimension2;
	double dimension3;
	
	
	public ThreeDimensionalShape(String name, double dimension1, double dimension2, double dimension3) { //생성자
		super();
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		this.dimension3 = dimension3;
		this.name = name;
	}

	public double getDimension1() { //개터
		return dimension1;
	}

	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}

	public double getDimension2() {
		return dimension2;
	}

	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}

	public double getDimension3() {
		return dimension3;
	}

	public void setDimension3(double dimension3) {
		this.dimension3 = dimension3;
	}

	String getName() {
		return name;
	}
}

class Cube extends ThreeDimensionalShape{
	static final String CLASS_NAME = "Cube";

	public Cube(String name, double dimension1, double dimension2, double dimension3) {
		super(name, dimension1, dimension2, dimension3);
		// TODO Auto-generated constructor stub
	}
	double getVolume() {
		return super.getDimension1()*super.getDimension1()*super.getDimension1();
	}
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]", super.getName(), CLASS_NAME, super.CLASS_NAME);
	}
}
class Sphere extends ThreeDimensionalShape{
	static final String CLASS_NAME = "Sphere";

	public Sphere(String name, double dimension1, double dimension2, double dimension3) {
		super(name, dimension1, dimension2, dimension3);
		// TODO Auto-generated constructor stub
	}
	double getVolume() {
		return 4./3.*Math.PI*super.getDimension1()*super.getDimension1()*super.getDimension1();
	}
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]", super.getName(), CLASS_NAME, super.CLASS_NAME);
	}
}
class Cylinder extends ThreeDimensionalShape{
	static final String CLASS_NAME = "Cylinder";

	public Cylinder(String name, double dimension1, double dimension3) {
		super(name, dimension1, dimension1, dimension3);
		// TODO Auto-generated constructor stub
	}
	double getVolume() {
		return Math.PI*super.getDimension1()*super.getDimension1()*super.getDimension3();
	}
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]", super.getName(), CLASS_NAME, super.CLASS_NAME);
	}
}
class Cone extends ThreeDimensionalShape{
	static final String CLASS_NAME = "Cone";

	public Cone(String name, double dimension1, double dimension3) {
		super(name, dimension1, dimension1, dimension3);
		// TODO Auto-generated constructor stub
	}
	double getVolume() {
		return 1./3.*Math.PI*super.getDimension1()*super.getDimension2()*super.getDimension3();
	}
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]", super.getName(), CLASS_NAME, super.CLASS_NAME);
	}
}

class Rectangularprism extends ThreeDimensionalShape{
	static final String CLASS_NAME = "Rectangularprism";

	public Rectangularprism(String name, double dimension1, double dimension2, double dimension3) {
		super(name, dimension1, dimension2, dimension3);
		// TODO Auto-generated constructor stub
	}
	double getVolume() {
		return super.getDimension1()*super.getDimension2()*super.getDimension3();
	}
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]", super.getName(),CLASS_NAME, super.CLASS_NAME);
	}
}

class Circle extends TwoDimensionalShape{
	static final String CLASS_NAME = "Circle";

	public Circle(String name, double dimension1) {
		super(name, dimension1, dimension1);
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return super.getDimension1();
	}

	public void setRadius(double r) {
		super.setDimension1(r);
		super.setDimension2(r);
	}

	
	public double getArea() {
		return Math.PI * super.getDimension1() * super.getDimension1();
	}
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]", super.getName(), CLASS_NAME, super.CLASS_NAME);
	}
}

class Rectangle extends TwoDimensionalShape{
	static final String CLASS_NAME = "Rectangle";

	public Rectangle(String name, double dimension1, double dimension2) {
		super(name, dimension1, dimension2);
		// TODO Auto-generated constructor stub
	}
	double getWidth() {
		return super.getDimension1();
	}
	double getHeight() {
		return super.getDimension2();
	}
	void setSize(double w, double h){
		super.setDimension1(w);
		super.setDimension2(h);
	}
	double getArea() {
		return super.getDimension1()*super.getDimension2();
	}
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]", super.getName(), CLASS_NAME, super.CLASS_NAME);
	}
}
class Square extends TwoDimensionalShape{
	static final String CLASS_NAME = "Square";

	public Square(String name, double dimension1) {
		super(name, dimension1, dimension1);
		// TODO Auto-generated constructor stub
	}
	void setSize(double w){
		super.setDimension1(w);
		super.setDimension2(w);
	}
	double getSize(double w, double h){
		return super.getDimension2();
	}
	double getArea() {
		return super.getDimension1()*super.getDimension2();
	}
	public String toString() {
		return String.format("%s is a [%s], and is a [%s]", super.getName(), CLASS_NAME, super.CLASS_NAME);
	}
}


