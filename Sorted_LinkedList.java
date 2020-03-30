
/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Sorted_LinkedList {
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
	public void Sorting()
	{
		Node current=head,index=null;
		int temp;
		if(head==null)
			System.out.println("The list is empty!!!");
		else
		{
			while(current!=null)
			{
				index=current.next;
				while(index!=null)
				{
					if(index.data<current.data)
					{
						temp=current.data;
						current.data=index.data;
						index.data=temp;
					}
					index=index.next;
				}
				current=current.next;
			}	
		}
	}
	public void Show()
	{
		Node current=head;
		if(head==null)
			System.out.println("The list is empty!!!");
		else
		{
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a size of Linked list:");
		int n=scanner.nextInt();
		System.out.println("Enter the data:");
		Sorted_LinkedList list=new Sorted_LinkedList();
		for(int i=0;i<n;i++)
		{
			int element=scanner.nextInt();
			list.addNode(element);
		}
		list.Sorting();
		System.out.println("Sorted List:");
		list.Show();
	}
}