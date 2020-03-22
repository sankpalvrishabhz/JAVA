/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Mirror_Pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of colomns to be printed of Stars:");
		int number=scanner.nextInt();
		int cols=number+1;
		for(i=cols;1<i;i--)
		{
			for(j=0;j<cols-i;j++)
				System.out.print(" ");
			for(j=2*(i-1);1<j;j--)
				System.out.print("*");
			System.out.println();
		}
		for(i=2;i<cols;i++)
		{
			for(j=cols-i;1<j;j--)
				System.out.print(" ");
			for(j=1;j<(2*i);j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
