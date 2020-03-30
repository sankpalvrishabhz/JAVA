
/**
 * 
 */
import java.util.*;
/**
 * @author Vrishabh
 *
 */
public class Prime_number {
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
	public void Show()
	{
		Node current=head;
		if(head==null)
			System.out.println("The list is empty!!!");
		else
		{
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_number list=new Prime_number();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int end = sc.nextInt();
		System.out.println("\nPrime numbers between "+start+" and "+end+" are : ");
		int count;
		int array[]=new int[end];
		for(int i = start ; i <= end ; i++)
		{
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
			{
				System.out.print(i+" ");
				array[i]=i;
			}
		}
		System.out.println("\n\nArray ");
		for(int i=1;i<end;i++)
		{
			if(0<array[i])
			System.out.print(array[i]+" ");
		}
		for(int i=1;i<end;i++)
		{
			if(0<array[i])
				list.addNode(array[i]);
		}
		System.out.println("\n\nList:");
		list.Show();
	}
}