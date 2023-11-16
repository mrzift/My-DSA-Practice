class Queue2{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public boolean isEmpty(){
        if(head == null && tail == null){
            return true;
        }
        return false;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.data;
        if(head == tail){// in case of single element
            tail=null;
        }
        head = head.next;

        return front;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }
}
public class QueueUsingLL {
    public static void main(String[] args) {
        Queue2 q = new Queue2();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        q.remove();
//        q.add(40);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
