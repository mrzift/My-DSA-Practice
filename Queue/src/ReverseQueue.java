import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()){
            s.push(q.peek());
            q.remove();
        }
        while (!s.isEmpty()){
            q.add(s.peek());
            s.pop();
        }
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
    }
    public static void reverseQueueRecursive(Queue<Integer> q){
            // Here the internal stack of recursion is being is used.
        if(q.isEmpty())
            return;
        int x = q.remove();
        reverseQueueRecursive(q);
        q.add(x);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        reverseQueueRecursive(q);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
