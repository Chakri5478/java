//Implementation of single inheritance
class Animal{
	String name;
	public Animal(String name){
		this.name=name;
	}
	public void eat(){
		System.out.println(name+" is eating!");
		
	}
	public void sleep(){
		System.out.println(name+" is sleeping!");
	}
}
class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
	void bark(){
		System.out.println(name+" is barking!");
	}
}
public class SingleInheritance{
	public static void main(String args[]){
		Dog d=new Dog("raja");
		d.eat();
		d.sleep();
		d.bark();
	}
}
