//ArrayList Demo program
import java.util.ArrayList;
public class ArrayListDemo2{
	public static void main(String args[]){
		ArrayList<Integer> numbers=new ArrayList<>();
		for(int i=1;i<=5;i++){
			numbers.add(i);
		}
		System.out.println("Using For each loop:");
		for(int num:numbers){
			System.out.println(num);
		}
		System.out.println("Using traditional For loop:");
		for(int i=0;i<5;i++){
			System.out.println(numbers.get(i));
		}
	}
}
