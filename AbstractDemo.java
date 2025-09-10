//Area for different shapes using Abstract
abstract class Shape{
	abstract void getArea();
	void display(){
		System.out.println("Concreate method called using child class");
	}

}
class Square extends Shape{
	double side;
	Square(double side){
		this.side=side;
	}
	void getArea(){
		System.out.println("Area of square:"+side*side);
	}
	
} 
class Rectangle extends Shape{
	double length,breadth;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void getArea(){
		System.out.println("Area of rectangle:"+length*breadth);
	}
}
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	void getArea(){
		System.out.println("Area of circle:"+3.14*radius*radius);
	}
}
public class AbstractDemo{
	public static void main(String args[]){
		Square s=new Square(4.5);
		s.getArea();
		s.display();
		Shape r=new Rectangle(3,5);
		r.getArea();
		Shape c=new Circle(6.5);
		c.getArea();
		/*Shape s1=new Shape();
		s1.display();*/
	}
}
