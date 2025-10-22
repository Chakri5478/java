//Implementation of multiple inheritance
class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	void eat(){
		System.out.println(name+" is eating");
	}
}

class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	void bark(){
		System.out.println(name+" is barking");
	}
}
class Cat extends Dog{
	
	Cat(String name){
		super(name);
	}
	void sleep(){
		System.out.println(name+" is sleeping");
	}
}
public class MultipleInheritance{
	public static void main(String args[]){
		Dog d=new Dog("raja");
		d.eat();
		d.bark();
		Cat c=new Cat("tarun");
		c.eat();
		c.sleep();
	}
}
