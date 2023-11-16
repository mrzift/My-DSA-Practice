class Deq{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public boolean isEmpty(){
        return head == null && tail == null;
    }
    public void addFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            return;
        }
        head.prev = newNode;
        head = newNode;
    }
    public void addRear(int data){
        Node newNode = new Node(data);
        newNode.prev = tail;
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public int removeFront(){
        if(isEmpty()){
            return -1;
        }
        if (head.next == null){
            int res = head.data;
            head = null;
            tail = null;
            return res;
        }
        int res = head.data;
        head = head.next;
        head.prev = null;
        return res;
    }
    public int removeRear(){
        if(isEmpty()){
            return -1;
        }
        if (head.next == null){
            int res = head.data;
            head = null;
            tail = null;
            return res;
        }
        int res = tail.data;
        tail = tail.prev;
        tail.next = null;
        return res;
    }
    public int getFront(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
    public int getRear(){
        if(isEmpty()){
            return -1;
        }
        return tail.data;
    }
}
public class DequeUsingLL {
    public static void main(String[] args) {
        Deq dq = new Deq();
        dq.addRear(20);
        dq.addFront(10);
        dq.removeRear();
        dq.addRear(30);
        dq.addFront(5);
        while (!dq.isEmpty()){
            System.out.println(dq.getFront());
            dq.removeFront();
        }
    }
}
