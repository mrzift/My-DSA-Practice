class Stack3{
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public int pop(){
        int res = head.data;
        head = head.next;
        return res;
    }
    public int peak(){
        return head.data;
    }

    public int size(){ // this is O(n) time complexity. we can make it O(1) TC by maintaining a size variable in
                        // push and pop function and then simply return the size.
        int count = 0;
        Node currNode = head;
        while (currNode != null ){
            count++;
            currNode = currNode.next;
        }
        return count;
    }

}
public class StackUsingLL {
    public static void main(String[] args) {
        Stack3 stack = new Stack3();
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peak());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
