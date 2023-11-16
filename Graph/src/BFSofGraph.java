import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFSofGraph { // when a vertex is given and graph is not disjoint.
    public void bFS(ArrayList<ArrayList<Integer>> adjList,int v, int s /*Given Vertex*/){
        Queue<Integer> q = new ArrayDeque<>();
        boolean visited[] = new boolean[v];
        q.add(s);
        visited[s] = true;
        while (!q.isEmpty()){
            int u = q.poll();
            System.out.println(u + " ");
            for(int x : adjList.get(u)){ // in place of x, it can be anything.
                if(visited[x]==false){
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
    }

    public void bFSDisjoint(ArrayList<ArrayList<Integer>> adjList, int v /*No. of vertex*/){
        boolean visited[] = new boolean[v+1];
        for(int i=0; i<v; i++){                 // TC = O(V+E). we are basically just traversing list
            if(visited[i]==false){              // of every vertex.
                bFS2(adjList, i, visited);
            }
        }
    }

    public void bFS2(ArrayList<ArrayList<Integer>> adjList, int s, boolean visited[]){ // for disjoint
        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        visited[s] = true;
        while (!q.isEmpty()){
            int u = q.poll();
            System.out.println(u + " ");
            for(int x: adjList.get(u)){ // in place of x, it can be anything.
                if(visited[x]==false){
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
    }

// No of islands in disjoint graph. Just few changes from disjoint graph everything else is same as before.
    public int bFSDisjointIslands(ArrayList<ArrayList<Integer>> adjList, int v /*No. of vertex*/){
        int count = 0;
        boolean visited[] = new boolean[v+1];
        for(int i=0; i<v; i++){                 // TC = O(V+E). we are basically just traversing list
            if(visited[i]==false){              // of every vertex.
                bFS2(adjList, i, visited);
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

    }
}
