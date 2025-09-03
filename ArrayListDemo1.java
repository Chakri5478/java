//Basic Array List Example
import java.util.ArrayList;
public class ArrayListDemo1{
	public static void main(String args[]){
		ArrayList<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		System.out.println("Fruits:"+fruits);
		System.out.println("First Fruit:"+fruits.get(0));
		fruits.remove("Mango");
		System.out.println("Fruits after removel:"+fruits);
	}
}
