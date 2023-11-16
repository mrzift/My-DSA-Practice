import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class KahnTopologicalSorting {
    public static void topologicalSort(ArrayList<ArrayList<Integer>> adjList, int V){
        int inDegree[] = new int[V];
        for(int i=0; i<adjList.size() /* V can also be used */; i++){
            for(int j=0; j<adjList.get(i).size(); i++){
                inDegree[adjList.get(i).get(j)]++;
            }
        }
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0; i<V; i++){
            if(inDegree[i]==0){
                q.add(i);
                }
            }
        while (!q.isEmpty()){
            int u = q.poll();
            System.out.println(u + " ");

            for(int x: adjList.get(u)){
                inDegree[x] = inDegree[x]-1;
                if(inDegree[x]==0){
                    q.add(x);
                }
            }
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 2);
        addEdge(adj,0, 3);
        addEdge(adj,1, 3);
        addEdge(adj,1, 4);
        addEdge(adj,2, 3);

        System.out.println("Following is a Topological Sort of");
        topologicalSort(adj,V);
    }
}
