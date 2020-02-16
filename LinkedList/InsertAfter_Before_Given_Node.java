package linkedList;



class Linked_list2
{
	
Node head;
	public class  Node
	{
		int data;
		Node next;
	 Node(int data)
	{
		this.data = data;
		next = null;
	}
}

	public void after_given_node(Node previous, int data)
	{
		if(previous==null)
		{
			System.out.print("Previous node cannot be null");
		}
		else
		{
			Node new_node = new Node(data);
			new_node.next = previous.next;
			previous.next = new_node;
		}
	}
	public void before_given_node(Linked_list2 list,Node before, int data)
	{
		
		Node pointer = list.head;
		
			Node new_node = new Node(data);
			if(pointer==before)
			{
				list.head = new_node;
			}
			else
			{	
			while(pointer.next!=before)
			{
				pointer = pointer.next;
			}
			pointer.next = new_node;
			
			}
			new_node.next = before;
	}
	
	
	void printList(Linked_list2 list)
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


public class InsertAfter_Before_Given_Node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Linked_list2 list = new Linked_list2();

        Linked_list2.Node first = new Linked_list2().new Node(1);
        Linked_list2.Node second = new Linked_list2().new Node(2);
        Linked_list2.Node four = new Linked_list2().new Node(4);
        first.next=second;
        second.next = four;
        list.head = first;
        list.after_given_node(second, 3);
        list.before_given_node(list,first, 9);
        list.before_given_node(list, four, 6);
        list.printList(list);
        
        
	}

}
