package graph;
import java.util.*;
class G_Araph
{
	
	LinkedList<Integer> adj[];
	int v;
	G_Araph(int v)
	{
		this.v = v;
		adj = new LinkedList[v];
		for(int i =0;i<v;i++)
		{
			adj[i] = new LinkedList<>();
		}
	}
	void addEdges(int u,int v,boolean bid)
	{
		adj[u].add(v);
		if(bid)
		adj[v].add(u);
	}
	void ssp(int src)
	{
		Map<Integer,Integer> dist = new HashMap<>();
		int infinity = 1000;
		for(int i =0;i<v;i++)
		{
			
		   dist.put(i,infinity);
		}
		Queue<Integer> q = new LinkedList<>();
		Map<Integer,Boolean> visited = new HashMap<>();
		q.add(src);
		visited.put(src,true);
		dist.put(src, 0);
		
		while(!q.isEmpty())
		{
			int node = q.peek();
			//System.out.println(node);
			q.remove();
			List<Integer> nodeList = adj[node];
			for(int x : nodeList)
			{
				
				if((dist.get(x)==infinity))
				{
					int new_distance =  dist.get(node) +1;
					q.add(x);
				    visited.put(x,true);
					dist.put(x,new_distance);
				}
			}
		}
		//display distance
		for(int i =0;i<v;i++)
		{
			System.out.println("Distance from "+src+"->"+i+" is "+dist.get(i));
			
		}
		
		
}
	
	
}
public class SingleSourceShortestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G_Araph g1 = new G_Araph(6);
		g1.addEdges(0, 1, true);
		g1.addEdges(1, 2, true);
		g1.addEdges(0, 4, true);
		g1.addEdges(2, 4, true);
		g1.addEdges(2, 3, true);
		g1.addEdges(3, 5, true);
		g1.addEdges(3, 4, true);
		g1.ssp(0);
	}

}
