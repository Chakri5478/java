//Implementation of Arrays methods
import java.util.Arrays;
public class ArraysMethods{
	public static void main(String args[]){
		//1.toString()
		int[] a={45,78,21,90,12};
		System.out.println("1.toString:");
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		//2.sort()
		Arrays.sort(a);
		System.out.println("2.sort:");
		System.out.println(Arrays.toString(a));
		//3.binarySearch()
		int index=Arrays.binarySearch(a,78);
		System.out.println("3.binarySearch:");
		System.out.println("78 found at index "+index);
		//4.equals()
		int[] b={89,34,87,90,27};
		System.out.println("4.equals:");
		System.out.println("array a = array b is:"+Arrays.equals(a,b));
		//5.fill()
		int[] c=new int[5];
		System.out.println("5.fill:");
		Arrays.fill(c,10);
		System.out.println(Arrays.toString(c));
		//6.copyOf()
		int[] newArray=Arrays.copyOf(a,7);
		System.out.println("6.copyOf:");
		System.out.println(Arrays.toString(newArray));
	}
}
