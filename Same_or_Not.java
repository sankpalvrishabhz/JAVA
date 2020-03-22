/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Same_or_Not {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of array:");
		int size=scanner.nextInt();
		int array1[]=new int[size];
		int array2[]=new int[size];
		int flag=0;
		System.out.println("Enter elements for 1st array");
		for(int i=0;i<size;i++)
			array1[i]=scanner.nextInt();
		System.out.println("Enter elements for 2nd array");
		for(int i=0;i<size;i++)
			array2[i]=scanner.nextInt();
		System.out.println("First array: ");
		for(int i=0;i<size;i++)
			System.out.println(array1[i]+" ");
		System.out.println("&\nSecond array:");
		for(int i=0;i<size;i++)
			System.out.println(array2[i]+" ");
		for(int i=0;i<size;i++)
		{
			if( array1[i] == array2[i])
				flag=1;
			else
				flag=0;
		}
		if(flag==1)
			System.out.println("Arrays are same");
		else
			System.out.println("Arrays are not same");
			
	}
}