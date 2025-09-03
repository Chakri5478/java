//Array List of Objects
import java.util.ArrayList;
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return id+"-"+name;
	}
}
public class ArrayListDemo4{
	public static void main(String args[]){
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(101,"Chakri"));
		students.add(new Student(102,"Mohithta"));
		students.add(new Student(103,"Raja"));
		for(Student s:students){
			System.out.println(s);
		}
	}
}
