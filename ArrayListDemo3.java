//ArrayLIst Searching
import java.util.ArrayList;
public class ArrayListDemo3{
	public static void main(String args[]){
		ArrayList<String> names=new ArrayList<>();
		names.add("Chakri");
		names.add("Raja");
		names.add("gopal");
		names.add("prasanth");
		String searchName="Pradeep";
		if(names.contains(searchName)){
			System.out.println(searchName+" is in the list.");
		}
		else{
			System.out.println(searchName+" is not in the list.");
		}
	}
}
