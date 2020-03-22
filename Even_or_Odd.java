/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Even_or_Odd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number= scanner.nextInt();
		if(number%2==0)
			System.out.println(number+" is a even number");
		else
			System.out.println(number+" is a odd number");
	}
	
}
