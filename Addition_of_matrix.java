/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Addition_of_matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Want a Matrix of:");
		int rows=scanner.nextInt();
		int cols=scanner.nextInt();
		int first[][]=new int[rows][cols];
		int second[][]=new int[rows][cols];
		int sum[][]=new int[rows][cols];
		System.out.println("Enter elements for 1st Matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				first[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Enter elements for 2nd Matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				second[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Addition of ");
		System.out.println("First matrix: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(first[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("+ \nSecond matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(second[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				sum[i][j] = first[i][j] + second[i][j];
			}
		}
		System.out.println("is");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}