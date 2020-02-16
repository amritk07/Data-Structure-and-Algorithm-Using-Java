package linkedList;


class Linked_List1
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
	void insertAtBeg(Linked_List1 list,int data)
	{
		
		Node new_node = new Node(data);
		
		if(list.head==null)
		{
			list.head = new_node;
		}
		else
		{
			new_node.next=list.head;
			list.head = new_node;
		}
		
		
	}
	void printList(Linked_List1 list)
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
public class InsertAtStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Linked_List1 list = new Linked_List1();
      list.insertAtBeg(list,5);
      list.insertAtBeg(list,4);
      list.insertAtBeg(list, 3);
      list.insertAtBeg(list, 2);
      list.insertAtBeg(list, 1);
      list.insertAtBeg(list, 0);
      
      list.printList(list);
	}

}
