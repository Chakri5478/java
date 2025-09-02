//Constructors chain
class A{
	A(){
		System.out.println("Constructor A is called");
	}
}
class B extends A{
	B(){
		System.out.println("Constructor B is called");
	}
}
class C extends B{
	C(){
		System.out.println("Constructor C is called");
	}
}
public class InheritanceDemo3{
	public static void main(String args[]){
		C c=new C();
	}
}
