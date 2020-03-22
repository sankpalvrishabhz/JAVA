/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Reverse_a_Word {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Word:");
		String str = scanner.nextLine();
		int length = str.length();
		String reverse = " ";
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reversed word of "+str+" is "+reverse);
	}

}
