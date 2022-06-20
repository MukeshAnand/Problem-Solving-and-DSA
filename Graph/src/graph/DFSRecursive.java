package graph;

import java.util.ArrayList;

public class DFSRecursive {

	    static void DFSUtil (int i, ArrayList<ArrayList<Integer>> list, int N, boolean vis[], ArrayList<Integer> res) 
	    {
	        if (vis[i]) return;
	        vis[i] = true;
	        
	        res.add (i);
	        
	        for (int j = 0; j < list.get(i).size(); j++)
	        {
	            if (!vis[list.get(i).get(j)]) 
	                DFSUtil (list.get(i).get(j), list, N, vis, res);
	        }
	    }
	    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> list, int N)
	    {
	        
	        boolean vis[] = new boolean[N];

	            
	        ArrayList<Integer> res = new ArrayList<Integer>(); 
	        
	        for (int i = 0; i < N; i++)
	        {
	            if (!vis[i])
	            {
	                DFSUtil (i, list, N, vis, res);
	            }
	        }
	        
	        return res;
	    }
	}

