package linkedList;

class Linked_list
{
	
Node head;
	static class  Node
	{
		int data;
		Node next;
	 Node(int data)
	{
		this.data = data;
		next = null;
	}
}
	
	
	//@SuppressWarnings("null")
	public void atEnd(Linked_list list, int data)
	{
		Node new_node = new Node(data);
		if(list.head==null)
		{
			list.head = new_node;
		}
		else
		{
			Node pointer = list.head;
			while(pointer.next!=null)
			{
				
				pointer = pointer.next;
			}
			pointer.next = new_node;
		}
	}
	
	void printList(Linked_list list)
	{
		//System.out.println("Hello");
		Node node = list.head;
		while(node!=null)
		{
			System.out.print(node.data+"->");
			node = node.next;
		}
	}	
	
	
	
	
	
	
	
}	
	
public class InsertAtLastInSingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Linked_list list = new Linked_list();
		list.atEnd(list, 0);
		list.atEnd(list, 1);
		list.atEnd(list, 2);
		list.atEnd(list, 3);
		list.atEnd(list, 4);
		list.printList(list);
		

		
		
		
		
	}

}
