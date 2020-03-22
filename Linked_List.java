/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Linked_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a size of Linked list:");
		int n=scanner.nextInt();
		int pos;
		System.out.println("Enter the data:");
		LinkedList list=new LinkedList();
		for(int i=0;i<n;i++)
		{
			list.add(scanner.nextInt());
		}
		System.out.println("Entered Linked list:");
		System.out.println(list);
		System.out.println("Enter an element for first position");
		list.addFirst(scanner.nextInt());
		System.out.println("After adding an element at first position");
		System.out.println(list);
		System.out.println("Enter an element for last position");
		list.addLast(scanner.nextInt());
		System.out.println("After adding an element at last position");
		System.out.println(list);
		list.removeFirst();
		System.out.println("After removing an element from first position");
		System.out.println(list);
		list.removeLast();
		System.out.println("After removing an element from last position");
		System.out.println(list);
		System.out.println("Enter an element to be added");
		int element=scanner.nextInt();
		System.out.println("Enter a position at which "+element+" to be added");
		pos=scanner.nextInt();
		list.add(pos,element);
		System.out.println("After adding "+element+" at"+pos+" position");
		System.out.println(list);
		System.out.println("Enter a position at which element to be deleted");
		pos=scanner.nextInt();
		list.remove(pos);
		System.out.println("After deleting element at "+pos+" position");
		System.out.println(list);
	}
}
 