//Second user defined package
package p2;
import p1.Shape;

public class Rectangle extends Shape{
	double length;
	double width;
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	public double calculateArea(){
		return length*width;
	}
}
