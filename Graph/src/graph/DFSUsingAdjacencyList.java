package graph;

import java.util.*;



public class DFSUsingAdjacencyList {

	List<List<Integer>> graph;
	boolean [] visted;
	
	
	DFSUsingAdjacencyList(int nodes){
		
		
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
	
	
	public void dfs(int start) {
		
		
		Stack<Integer> s = new Stack<>();
		
		s.push(start);
		visted[start] = true;
		
		while(!s.empty()) {
			
			
			System.out.print(s.peek()+" ");
			
			List<Integer> neighbourNodes = graph.get(s.pop());
			
			for(Integer i: neighbourNodes) {
				
				if(!visted[i]) {
					s.push(i);
					visted[i]=true;
				}
				
			}
			
			
			
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		DFSUsingAdjacencyList dfs = new DFSUsingAdjacencyList(7);
		
		
		dfs.addEdges(0, 1);
		dfs.addEdges(0, 2);
		dfs.addEdges(1, 3);
		dfs.addEdges(3, 5);
		dfs.addEdges(2, 4);
		dfs.addEdges(4, 5);
		dfs.addEdges(4, 6);
		
	    dfs.dfs(0);
	    
	    
	    
		
		
		
		
	}
}
