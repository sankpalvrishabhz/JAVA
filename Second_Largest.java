 /**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Second_Largest {

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
		int first;
		int second;
		System.out.print("The second largest number among this array: ");
		for(int i=0;i<size;i++)
			System.out.print(array1[i]+" ");
		if(array1[1]<array1[0])
		{
			first=array1[0];
			second=array1[1];
		}
		else
		{
			first=array1[1];
			second=array1[0];
		}
		for(int i=2;i<size;i++)
		{
			if( first < array1[i])
			{
				second = first;
				first=array1[i];
			}
			else if(second < array1[i])
			{
				second=array1[i];
			}	
		}
		System.out.println("is:"+second);
	}
}