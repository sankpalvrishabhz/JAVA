/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Smallest_from_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of array:");
		int size=scanner.nextInt();
		int array1[]=new int[size];
		System.out.println("Enter elements for array");
		for(int i=0;i<size;i++)
			array1[i]=scanner.nextInt();
		int min=array1[0];
		System.out.print("The smallest value among this array: ");
		for(int i=0;i<size;i++)
			System.out.print(array1[i]+" ");
		for(int i=0;i<size;i++)
		{
			if( array1[i] < min)
				min=array1[i];
		}
		System.out.println("is:"+min);
	}
}