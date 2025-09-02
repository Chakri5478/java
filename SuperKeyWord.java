//Using of Super Keyword
class Parent{
	int num=100;
	Parent(){
		System.out.println("Parent constructer is called");
	}
	void display(){
		System.out.println("Parent class is called");
	}
}
class Child extends Parent{
	int num=200;
	Child(){
		super();
		System.out.println("Child class constructer is called");
	}
	void show(){
		System.out.println("Num value in Child class:"+num);
		System.out.println("Num value in Parent class:"+super.num);
	}
}
public class SuperKeyWord{
	public static void main(String args[]){
		Child c=new Child();
		c.show();
	}
}
