
    class Stack{
        int capacity;
        int top;
        int arr[];

        public Stack(int capacity) {
            this.capacity = capacity;
            top = -1;
            arr = new int[capacity];
        }

        boolean isEmpty(){
            return top < 0;
        }

        void push(int data){
            top++;
            if (top >= capacity) {
                System.out.println("Stack overflow");
                return;
            }
            arr[top] = data;
        }

        int pop(){
            if (top >= capacity) {
                System.out.print("Stack overflow" + " ");
                return -1;
            }
            if (top < 0) {
                System.out.print("Stack Underflow" + " ");
                return -1;
            }
            int res = arr[top];
            top--;
            return res;
        }
        int peak(){
            if (top < 0) {
                System.out.print("Stack Underflow"+ " ");
                return -1;
            }
        return arr[top];
        }
        int size(){
            return top+1;
        }

    }

public class StackUsingArray {

    public static void main(String[] args) {
    Stack stack = new Stack(4);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
