public class CircularLL {
    Node head;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public void addFirst(int data){ // Naive solution. TC = O(n)
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                head.next = head;
            }
            Node currNode = head.next;
            while(currNode.next != head){
                currNode = currNode.next;
            }
            newNode.next = head;
            currNode.next = newNode;
            head = newNode;
        }

    public void betterAddFirst(int data){ // Better solution. TC = O(1)
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
        }
        newNode.next = head.next;
        head.next = newNode;
        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;
    }

    public void betterAddLast(int data){ // better solution. TC = O(1). There is a naive solution as well. O(n)
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
        }
        newNode.next = head.next;
        head.next = newNode;
        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;
        head = newNode;
    }
        public void printCLL(){
            if (head == null){
                System.out.println("Empty List");
                return;
            }
            System.out.print(head.data + " -> ");
            Node currNode = head.next;
            while(currNode != head){
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.println(head.data);
        }

        public void deleteHead(){ /* Efficient solution. copy the head.next node to head node and delete the
                                     head.next node,i.e, point the head node to head.next.next */
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        if(head.next == head){
            head.next = null;
            return;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        }
        public void deleteKth(int pos){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        if(pos == 1){
            deleteHead();
            return;
        }
        Node currNode = head;
        for(int i=1; i<=pos-2; i++){
            currNode=currNode.next;
        }
        currNode.next = currNode.next.next;
        }

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.addFirst(30);
        cll.addFirst(20);
        cll.addFirst(10);
        cll.betterAddLast(40);
        cll.betterAddLast(50);
        cll.betterAddFirst(5);
        cll.betterAddLast(60);
        cll.printCLL();
//        cll.deleteKth(1);
//        cll.printCLL();
    }
}
