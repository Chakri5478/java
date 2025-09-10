//Interface
interface Bird{
	void fly();
}
interface Dog{
	void bark();
}
class Animal implements Bird,Dog{
	public void fly(){
		System.out.println("Birds will fly");
	}
	public void bark(){
		System.out.println("Dog will bark");
	}
}
public class InterfaceDemo{
	public static void main(String args[]){
		Animal a=new Animal();
		a.fly();
		a.bark();
	}
}
