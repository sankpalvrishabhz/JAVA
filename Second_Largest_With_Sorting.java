 /**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Second_Largest_With_Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of array:");
		int size=scanner.nextInt();
		int array[]=new int[size];
		int i,j,temp;
		System.out.println("Enter elements for array");
		for(i=0;i<size;i++)
			array[i]=scanner.nextInt();
		for(j=0;j<size;j++)
			for(i=1;i<size-j;i++)
				if(array[i]<array[i-1])
				{
					temp=array[i-1];
					array[i-1]=array[i];
					array[i]=temp;
				}
		System.out.println("Sorted array:");
		for(i=0;i<size;i++)
			System.out.print(array[i]+" ");
		System.out.println("\nThe second largest number among this array: "+array[i-2]);
	}
}