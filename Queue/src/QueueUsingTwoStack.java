import java.util.Stack;

class Queue3{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(data);
        while (!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
    }
    public int remove(){
        if(s1.isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }
        return s1.pop();
    }
    public int peek(){
        if(s1.isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }
        return s1.peek();
    }
    public boolean isEmpty(){
        return s1.isEmpty();
    }
}
public class QueueUsingTwoStack {
    public static void main(String[] args) {
        Queue3 q = new Queue3();
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        q.add(40);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

