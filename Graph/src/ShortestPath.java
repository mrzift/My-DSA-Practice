import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class ShortestPath {

    public void shortestPath(ArrayList<ArrayList<Integer>> adj, int v, int s){
        int dist[] = new int[v];
        for (int i=0; i<v; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s]=0;
        boolean visited[] = new boolean[v];
        Queue<Integer> q = new ArrayDeque<>();
        visited[s]=true;
        q.add(s);
        while(!q.isEmpty()){
            int u = q.poll();
            for(int x : adj.get(u)){
                if(visited[x]==false) {
                    dist[x] = dist[u] + 1;
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
        for(int i=0; i<v; i++){
            System.out.print(dist[i] + " ");
        }
    }
}
