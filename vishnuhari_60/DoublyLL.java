import java.util.*;
class Doubly
{
	Scanner sc = new Scanner(System.in);
	class Node
	{
		int data;
		Node next,prev;
	}
	Node head,tail,temp;
	Doubly()
	{
		head=null;tail=null;
	}
	void insertitem()
	{
		int item;
		Node n = new Node();
		System.out.println("enter the data:");
		item=sc.nextInt();
		n.data=item;
		n.next=null;
		n.prev=tail;
		if(tail!=null)
		{
			tail.next=n;
		}
		else 
			head=n;
		tail=n;
	}
	void deleteitem()
	{
		if(head==null && tail==null)
		{
			System.out.println("list is empty");
		}
		else
		{
		
			int item,flag=0;
			System.out.println("enter the item to be deleted:");
			item=sc.nextInt();
			temp=head;
			while(temp!=null && temp.data!=item)
			{
				temp=temp.next;
			}
			if(temp==null)
				System.out.println("element not found");
			else if(temp.next==null && temp.prev==null)
			{
				head=null;
				tail=null;
			}
			else if(temp.prev!=null && temp.next!=null)
			{
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
			}
			else if(temp.next==null)
			{
				temp.prev.next=null;
				tail=temp.prev;
			}
			else
			{
				temp.next.prev=null;
				head=temp.next;
			}
		}
	}
	void display()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
		System.out.println();
	}
}
class DoublyLL
{
	public static void main(String args[])
	{
		Doubly d = new Doubly();
		int opt;
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.println("\n1.INSERT\n2.DISPLAY\n3.DELETE\n4.EXIT\n");
			opt=s.nextInt();
			switch(opt)
			{
				case 1: 
					d.insertitem();
					break;
				case 2:	
					d.display();
					break;
				case 3:	
					d.deleteitem();
					break;
				case 4: 
					break;
				default:
					System.out.println("enter a valid input");
			}
		}while(opt!=4);
	}
}
