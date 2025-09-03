//Vector Demo Program
import java.util.Vector;
public class VectorDemo1{
	public static void main(String[] args){
	Vector<String> animal=new Vector<>();
	animal.add("Dog");
	animal.add("Cat");
	animal.add("Lion");
	System.out.println("Animals:"+animal);
	System.out.println("First Animal:"+animal.get(0));
	animal.remove("Cat");
	System.out.println("After removel Animals:"+animal);
	}
}
