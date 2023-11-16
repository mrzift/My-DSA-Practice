import java.util.LinkedList;
import java.util.Queue;

public class GeneratingNumbers {
    public static void genNum(String s1, String s2, int n){
        Queue<String> q = new LinkedList<>();
        q.add(s1);
        q.add(s2);
        for(int i=0 ; i<n; i++){
            String curr = q.peek();
            System.out.println(curr + " ");
            q.remove();
            q.add(curr + "5");
            q.add(curr + "6");
        }
//        while (!q.isEmpty()){
//            System.out.println(q.poll());
//        }
    }
    public static void main(String[] args) {
        String s1 = "5";
        String s2 = "6";
        int n = 5;
        genNum(s1, s2, n);
    }
}
