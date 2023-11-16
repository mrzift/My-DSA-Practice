import java.util.ArrayList;

public class CycleDetectionInDirectedGraph {
        private boolean dfsRecursive(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, boolean recSt[]) {
        visited[s] = true;
        recSt[s]=true;
        for(int u : adj.get(s)){
            if(visited[u]==false && dfsRecursive(adj, u, visited,recSt)){
                return true;
            } else if (recSt[u]==true) {
                return true;
            }
        }
        recSt[s]=true;
        return false;
    }

    public boolean dFSMainDisjoint(ArrayList<ArrayList<Integer>> adj, int v, int s){
        boolean recSt[] = new boolean[v];
        boolean visited[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(visited[v]==false){
                if(dfsRecursive(adj, i, visited,recSt) == true){
                    return true;
                }
            }
        }
        return false;
    }
}
