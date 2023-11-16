import java.util.ArrayList;

public class DFSofGraph {
    public void dFSMain(ArrayList<ArrayList<Integer>> adj, int v, int s){
        boolean visited[] = new boolean[v];
        dfsRecursive(adj, s, visited);
    }

    private void dfsRecursive(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.println(s + " ");
        for(int x : adj.get(s)){
            if(visited[x]==false){
                dfsRecursive(adj, x, visited);
            }
        }
    }

    public void dFSMainDisjoint(ArrayList<ArrayList<Integer>> adj, int v, int s){
        boolean visited[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(visited[v]==false){
                dfsRecursive(adj, i, visited);
            }
        }
    }
    public static void main(String[] args) {

    }
}
