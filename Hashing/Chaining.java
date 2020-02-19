package hashingProblem;
import java.util.*;


public class Chaining
{
	public int bucket;
	 LinkedList<Integer> table[];
	@SuppressWarnings("unchecked")
	Chaining(int b)
	{
		bucket = b;
		table = new LinkedList[bucket];
		for(int i=0;i<bucket;i++)
		{
			table[i] = new LinkedList<Integer>();
		}
	}

	public  int  hash(int key)
	{
		return key%bucket;
	}
	public void insert(int key)
	{
		int i = hash(key);
		table[i].add(key);
		
	}
	public  void delete(int key)
	{
		int i = hash(key);
		 table[i].removeFirstOccurrence(key);
		
		
	}
	public boolean search(int key)
	{
		int i = hash(key);
		for(int x : table[i])
		{
			if(x==key)
			{
			  
				System.out.println(i);
				return true;
				
			}	
		}
		return false;
	}
	public static void main(String[] args)
	{
		Chaining chain = new Chaining(7);
		chain.insert(50);
		chain.insert(700);
		chain.insert(101);
		chain.insert(76);
		chain.insert(85);
		chain.insert(92);
		chain.insert(73);
		if(chain.search(700)) System.out.println("Elment found");
	
		chain.delete(700);
		
		if(!chain.search(700)) System.out.println("Element not found");
		
		
	}
}