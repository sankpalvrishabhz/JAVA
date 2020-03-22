/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Positive_or_Negative {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number= scanner.nextInt();
		if(number<0)
			System.out.println(number+" is a Negative number");
		else
			System.out.println(number+" is a Positive number");
	}

}
