
/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Largest_in_LinkedList {
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	/**
	 * @param args
	 */
	public Node head=null;
	public Node tail=null;
	public void addNode(int element)
	{
		Node newNode=new Node(element);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void LargestElement()
	{
		Node current=head;
		int maximum;
		if(head==null)
			System.out.println("The list is empty!!!");
		else
		{
			maximum=head.data;
			while(current!=null)
			{
				if(maximum<current.data)
					maximum=current.data;
				current=current.next;
			}
			System.out.println("Maximum element:"+maximum);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a size of Linked list:");
		int n=scanner.nextInt();
		System.out.println("Enter the data:");
		Largest_in_LinkedList list=new Largest_in_LinkedList();
		for(int i=0;i<n;i++)
		{
			int element=scanner.nextInt();
			list.addNode(element);
		}
		list.LargestElement();
	}
}