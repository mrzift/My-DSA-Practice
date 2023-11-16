import java.util.Stack;

public class PushToBottom {
    public static void pushToBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int stor = s.pop();
        pushToBottom(s, data);
        s.push(stor);
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
//        s.push(30);
//        pushToBottom(s,5);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
