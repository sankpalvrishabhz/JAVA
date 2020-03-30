/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Reverse_an_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of array:");
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter "+size+" elements for array");
		for(int i=0;i<size;i++)
			array[i]=scanner.nextInt();
		for(int j=0;j<size;j++)
			for(int i=1;i<size-j;i++)
			{		
				int temp=array[i-1];
				array[i-1]=array[i];
				array[i]=temp;
			}
		for(int i=0;i<size;i++)
			System.out.print(array[i]+" ");
	}
}
