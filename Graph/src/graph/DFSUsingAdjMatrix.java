package graph;

import java.util.Stack;

class Vertices{
	
    String data ;
    
    boolean isVisited;
    
    Vertices(String data){
    	this.data = data;
    	isVisited =false;
    }
	
}


public class DFSUsingAdjMatrix {
	
	private final int max = 20;
	
	Vertices[] vertices;
	int[][]  adj;
	Stack<Integer> s;
	int nVerts;
	
	
	DFSUsingAdjMatrix(){
		this.vertices = new Vertices[max];
		this.adj = new int[max][max];
		this.s= new Stack<>();
		this.nVerts = 0;
	}
	
	
	public void addVertex(String str) {
		vertices[nVerts++] = new Vertices(str);
	}
	
	
	public void addEdge(int start,int end) {
		adj[start][end] = 1;
		adj[end][start] = 1;
	}
	public void display(int v) {
		System.out.print(vertices[v].data+" ");
	}
	
	
   public int getAdj(int v) {
	   
	   for(int i=0;i<nVerts;i++) {
		   if(adj[v][i] ==1&&!vertices[i].isVisited) 
			   return i;
	   }
	   return -1;
   }
	
	public void dfs() {
		
		vertices[0].isVisited=true;
		display(0);
		s.push(0);
		
		
		while(!s.empty()) {
			
			int v = getAdj(s.peek());
			
			if(v ==-1) {
				s.pop();
			}else {
				vertices[v].isVisited =true;
				display(v);
				s.push(v);
			}

		}
	}
	
	public static void main(String[] args) {
		
		DFSUsingAdjMatrix graph = new DFSUsingAdjMatrix();
		
		graph.addVertex("A");
		graph.addVertex("C");
		graph.addVertex("B");
		graph.addVertex("D");
		graph.addVertex("E");
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(1, 4);
		graph.addEdge(1, 3);
		
		
		 System.out.println("Visits: ");
		    graph.dfs();
		    System.out.println();
		
	}
	

}
