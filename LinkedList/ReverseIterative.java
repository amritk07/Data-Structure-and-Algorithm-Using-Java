package linkedList;
class Linked_LIST11
{
	
	Node1 head;
	class Node1
	{
		int data;
		Node1 next;
	Node1(int data)
	{
		this.data = data;
		next = null;
	}
	
	}
	public void insert(Linked_LIST11 list, int data)
	{
		Node1 new_node = new Node1(data);
		if(list.head==null)
		{
			list.head = new_node;
		}
		else
		{
			Node1 node = list.head;
			while(node.next!=null)
			{
				node = node.next;
				
			}
			node.next = new_node;
		}
	}
	public void display(Linked_LIST11 list)
	{
		Node1 node = list.head;
		while(node!=null)
		{
			System.out.print(node.data+"->");
			node = node.next;
		}
	}
	
	public void iterativeReverse(Linked_LIST11 list)
	{
		Node1 current = list.head;
		Node1 pre = null;
		Node1 next = null;
		while(current!=null)
		{
			next = current.next;
			current.next  = pre;
			pre = current;
			current = next;
		}
		list.head = pre;
		
	}
}
public class ReverseIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linked_LIST11 list = new Linked_LIST11();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.display(list);
		System.out.println();
		list.iterativeReverse(list);
		list.display(list);

	}

}
