//Super Method
class Animal{
	Animal(){
		System.out.println("Parent class constructer is called");
	}
	void show(){
		System.out.println("Parent method");
	}
}
class Dog extends Animal{
	Dog(){
		super();
		System.out.println("Child class constructer is called");
	}
	void show(){
		super.show();
		System.out.println("Child method");
	}
}
public class SuperMethod{
	public static void main(String args[]){
		Dog d=new Dog();
		d.show();
	}
}
