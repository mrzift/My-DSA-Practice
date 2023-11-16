import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class RotateQueueByKNumbers {
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        int siz = q.size();
        Queue<Integer> qq = new ArrayDeque<>();
        Stack<Integer> s = new Stack<>();
        for(int i=1; i<=k; i++){
            s.push(q.peek());
            q.remove();
        }
        for(int i=1; i<=k; i++){
            qq.add(s.peek());
            s.pop();
        }
        for(int i=1; i<= siz-k; i++){
            qq.add(q.peek());
            q.remove();
        }
        return qq;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int k = 3;
        Queue<Integer> qqq;
        qqq = modifyQueue(q,k);
        System.out.println(qqq);
    }
}