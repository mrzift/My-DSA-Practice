import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        PushToBottom.pushToBottom(s,top);
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        reverseStack(s);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
