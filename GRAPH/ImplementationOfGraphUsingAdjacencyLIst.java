package graph;

import java.util.LinkedList;
import java.util.Queue;

class Graph11

{
	
	int vertices;
	LinkedList<Integer> adj[];
	
	
	public Graph11(int vertices)
	{
		this.vertices = vertices;
		adj = new LinkedList[vertices];
		for(int i =0;i<vertices;i++)
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
	void displayGraph()
	{
		for(int i =0;i<vertices;i++)
		{
			if(adj[i].size()>0)
			{
				System.out.print(i+" "+"->");
			for(int j =0;j<adj[i].size();j++)
			{
				System.out.print(adj[i].get(j));
				if(j<=adj[i].size()-2)
				{
					System.out.print(",");
				}
				
			}
			System.out.println();
		    }
	}	
		
}
	
}
public class ImplementationOfGraphUsingAdjacencyLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Graph graph = new Graph(10);
        graph.addEdges(0, 1,true);
        graph.addEdges(0, 4,true);
        graph.addEdges(0, 5,true);
        graph.addEdges(0, 6,true);
       
        graph.addEdges(1, 2,true);
        graph.addEdges(2, 5,true);
        graph.addEdges(2, 3,true);
        graph.addEdges(3, 6,true);
        graph.addEdges(3, 7,true);
        graph.addEdges(4, 8,true);
        graph.addEdges(4, 5,true);
        graph.addEdges(5, 8,true);
        graph.addEdges(6, 9,true);
        graph.addEdges(7, 9,true);
        graph.addEdges(8, 9,true);
        
        graph.displayGraph();
	}
}