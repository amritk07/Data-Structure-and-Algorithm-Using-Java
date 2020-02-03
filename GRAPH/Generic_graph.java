package graph;
import java.util.*;
import java.util.Map.Entry;

class Graph1<T>
{
	private Map<T, List<T>> map;
	public Graph1()
	{
		map=new HashMap<>();
	}
	//adding vertex first the creating path
	public void addVertex(T s)
	{
		map.put(s, new LinkedList<T>()); 
	}
	public void addEdges(T source ,T destination, boolean bid)
	{
		if(!map.containsKey(source)) 
			addVertex(source);
		if(!map.containsKey(destination))
			addVertex(destination);
		map.get(source).add(destination);
		if(bid)
		{
			map.get(destination).add(source);
		}
	}
	public void display()
	{
		int count =0;
		for (Entry<T, List<T>> entry : map.entrySet()) 
		{
			count =0;
            System.out.print (entry.getKey());
            		
           if(map.containsValue(entry.getValue()))
           {
        	   if(count==0)
        	   System.out.print("->");
        	   count++;
        	  System.out.print(entry.getValue()); 
           }
           System.out.println();
                            
		}
		
	}
	void bfs(T s)
	{
		Queue<T> q=new LinkedList<T>();
		Map<T,Boolean> visited = new HashMap<>();
		q.add(s);
		visited.put(s,true);
		while(!q.isEmpty())
		{
			T node = q.peek();
			

			
			System.out.print(node+" ");
			q.remove();
			List<T> neighbours=map.get(node);
			for(T x : neighbours)
			{ //System.out.print(x+" ");
				if(!visited.containsKey(x))
				{
					
					q.add(x);
					
				}	
				visited.put(x, true);
				
			}
			
			
			 
		}
		
		
		
	}
	
}
public class Generic_graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Graph1<String> g1 = new Graph1<>();
    //g1.addEdges("putin", "trump", false);
    //g1.addEdges("putin", "pope",false);
    //g1.addEdges("putin", "modi",false);
    //g1.addEdges("modi", "trump",true);
   // g1.addEdges("modi", "rss", true);
   // g1.display();
		Graph1<Integer> g1 = new Graph1<>();
		g1.addEdges(0, 1, true);
		g1.addEdges(1, 2, true);
		g1.addEdges(0, 4, true);
		g1.addEdges(2, 4, true);
		g1.addEdges(2, 3, true);
		g1.addEdges(3, 5, true);
		g1.addEdges(3, 4, true);
		g1.display();
         //g1.bfs("putin");
		g1.bfs(2);

		
		
	}

}
