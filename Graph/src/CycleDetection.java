import java.util.ArrayList;

public class CycleDetection {
    public boolean cycleDetectionUsingDFSMainDisjoint(ArrayList<ArrayList<Integer>> adj, int v, int s){
        boolean visited[] = new boolean[v+1];
        for(int i=0; i<v; i++){
            if(visited[v]==false){
                if(dfsRecursive(adj, i, visited, -1)==true){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfsRecursive(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;
        for(int x : adj.get(s)){
            if(visited[x]==false){
                if(dfsRecursive(adj, x, visited,s)==true){
                    return true;
                }
            } else if (x != parent) {
                return true;
            }
        }
        return false;
    }
}
