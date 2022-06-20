package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class GraphConectedComp {
  List<List<Integer>> graph;
  boolean visited[];
  int nodes;

  GraphConectedComp(int nodes) {
    graph = new ArrayList<>();
    visited = new boolean[nodes];
    this.nodes = nodes;

    for (int i = 0; i < nodes; i++) {
      graph.add(i, new ArrayList<>());
    }
  }

  public void addEdge(int a, int b) {
    graph.get(a).add(b);
    graph.get(b).add(a);
  }
  
  public int numberOfConnectedComponent() {
    int numberOfConnectedComponent = 0;
    
    for(int i = 0; i < nodes; i++) {
      if(!visited[i]) {
        dfs(i);
        numberOfConnectedComponent++;
      }
    }
    
    return numberOfConnectedComponent;
  }

  public void dfs(int start) {

	  Stack<Integer> s = new Stack<>();
	  
	  s.push(start);
	  visited[start] = true;
	  
	  
	  while(!s.empty()) {
		  
		  Integer node = s.pop();
		  
		  List<Integer> neighbour = graph.get(node);
		  
		  for(Integer i: neighbour) {

			  if(!visited[i]) {
				  s.push(i);
				  visited[i]=true;
			  }
		  }
		  
	  } 

}
}

public class GetConnectedComp {

  public static void main(String[] args) {
    int nodes = 7;
    
    GraphConectedComp a = new GraphConectedComp(nodes);
    
    a.addEdge(0, 1);
    a.addEdge(0, 2);
    a.addEdge(1, 3);
    
    a.addEdge(4, 5);
    a.addEdge(4, 6);

    System.out.println(a.numberOfConnectedComponent());
  }

}