//Implementation of multiple inheritance
class Animal{
	String name;
	void living(){
		System.out.println("There are many types of animals");
	}
}

class Dog extends Animal{
	
	void bark(){
		System.out.println("Dog is a pet animal");
	}
}
class Cat extends Dog{
	void enemy(){
		System.out.println("Dog and cat are enemies");
	}
}
public class MultipleInheritance{
	public static void main(String args[]){
		Cat d=new Cat();
		d.living();
		d.enemy();
		d.bark();
	}
}
