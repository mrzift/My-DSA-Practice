public class DoubleyLL {
    Node head;
    Node prev;
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.prev = currNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.prev.next = null;
    }
    public void printDL() {
        if(head == null){
            System.out.println("This list is empty");
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public void reverseIterative(){
        Node currNode = head;
        Node nextNode = currNode.next;
        while(currNode.next != null){
            currNode.prev = nextNode;
            nextNode.next = currNode;

            currNode = currNode.next;
            nextNode = nextNode.next;
        }

    }

    public static void main(String[] args) {
        DoubleyLL dll = new DoubleyLL();
        dll.addFirst(20);
        dll.addFirst(10);
        dll.printDL();
        dll.addLast(30);
        dll.addLast(40);
        dll.printDL();
        dll.reverseIterative();
        dll.printDL();
    }
}
