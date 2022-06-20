package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class VerticesBFS{
	
    String data ;
    
    boolean isVisited;
    
    VerticesBFS(String data){
    	this.data = data;
    	isVisited =false;
    }
	
}


public class BFSUsingAdjMatrix {
	
	private final int max = 20;
	
	VerticesBFS[] vertices;
	int[][]  adj;
	Queue<Integer> q;
	int nVerts;
	
	
	BFSUsingAdjMatrix(){
		this.vertices = new VerticesBFS[max];
		this.adj = new int[max][max];
		this.q= new LinkedList<>();
		this.nVerts = 0;
	}
	
	
	public void addVertex(String str) {
		vertices[nVerts++] = new VerticesBFS(str);
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
	
	public void bfs() {
		vertices[0].isVisited =true;
		q.offer(0);
		display(0);
		
		while(!q.isEmpty()) {
			
			int v1 = q.poll();
			int v2;
			while((v2=getAdj(v1))!=-1) {
				
				vertices[v2].isVisited =true;
				display(v2);
				q.offer(v2);
			}

		}
		
		
	
	}
	
	public static void main(String[] args) {
		
		BFSUsingAdjMatrix graph = new BFSUsingAdjMatrix();
		
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
		    graph.bfs();
		    System.out.println();
		
	}
	

}
