package linkedList;
class LinkedList

{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
			
		}
	}
	public LinkedList insert(LinkedList list, int data)
	{
		Node new_node =new Node(data);
		new_node.next = null;
		if(list.head==null)
		{
			list.head = new_node;
		}
		else
		{
			Node last = list.head;
			while(last.next!=null)
			{
				last = last.next;
			}
			last.next = null;
		}
		
		
		return list;
	}
	public void printList(LinkedList list)
	{
		Node pointer = list.head;
		while(pointer!=null)
		{
		System.out.println(pointer.data+"->");
		pointer = pointer.next;
		}
		
	}
	
}
public class LearnLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list = list.insert(list, 1); 
        list = list.insert(list, 2); 
        list = list.insert(list, 3); 
        list = list.insert(list, 4); 
        list = list.insert(list, 5); 
        list = list.insert(list, 6); 
        list = list.insert(list, 7); 
        list = list.insert(list, 8); 
  
        // Print the LinkedList 
        list.printList(list); 
	}

}
