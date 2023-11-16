import java.util.ArrayList;
class Stack2{
        ArrayList<Integer> al = new ArrayList<>();
        void push(int data){
            al.add(data);
        }
        int pop(){
            int res = al.get(al.size()-1);
            al.remove(al.size()-1);
            return res;
        }
        int peek(){
            int res = al.get(al.size()-1);
            return res;
        }
        boolean isEmpty(){
            return al.isEmpty();
        }
        int size(){
            return al.size();
        }
    }
public class StackUsingArrayList {
    public static void main(String[] args) {
        Stack2 stack = new Stack2();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        boolean smth = stack.isEmpty();
        System.out.println(stack.isEmpty());
    }
}
