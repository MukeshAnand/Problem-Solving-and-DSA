package graph;

import java.util.*;



public class BFSUsingAdjacencyList {

	List<List<Integer>> graph;
	boolean [] visted;
	
	
	BFSUsingAdjacencyList(int nodes){
		
		
		graph = new ArrayList<>();
		
		visted = new boolean[nodes];
		
		for(int i=0;i<nodes;i++) {
			graph.add(i, new ArrayList<>());
		}
	}
	
	
	public void addEdges(int start,int end) {
		graph.get(start).add(end);
		graph.get(end).add(start);
		
	}
	
	
	public void bfs(int start) {
		
		
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(start);
		visted[start] = true;
		
		while(!q.isEmpty()) {
			
			
			System.out.print(q.peek()+" ");
			
			List<Integer> neighbourNodes = graph.get(q.poll());
			
			for(Integer i: neighbourNodes) {
				
				if(!visted[i]) {
					q.offer(i);
					visted[i]=true;
				}
				
			}
			
			
			
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		BFSUsingAdjacencyList dfs = new BFSUsingAdjacencyList(7);
		
		
		dfs.addEdges(0, 1);
		dfs.addEdges(0, 2);
		dfs.addEdges(0, 3);
		dfs.addEdges(1, 4);
		dfs.addEdges(2, 4);
		dfs.addEdges(2, 5);
		dfs.addEdges(4, 5);
		
	    dfs.bfs(0);
	    
	    
	    
		
		
		
		
	}
}
