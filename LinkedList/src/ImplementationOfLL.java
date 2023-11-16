import java.util.LinkedList;

public class ImplementationOfLL {
    Node head;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
    public static void simpleFun(){
        System.out.println("In simple func");
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printLL() { // requires O(n) T.C. and O(1) auxiliary space. Better than recursion.
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        head = head.next;
        return;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    public void addInMiddle(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for (int i = 1; i <= pos - 2; i++) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public int search(int num) {
        int pos = 1;
        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == num) {
                return pos;
            } else {
                currNode = currNode.next;
                pos++;
            }
        }
        return -1;
    }

    public int mySize() {
        int size = 0;
        Node currNode = head;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }
        return size;
    }

    public void reverseIterative() {
        if (head == null || head.next == null) {
            System.out.println("Empty List");
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }


        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseListRecursive(Node head) {
        //empty node || last node or only one node
        if (head == null || head.next == null) {
            return head;
        }


        Node newHead = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void deleteFromLast(int pos) {
        int posFromStart = mySize()-pos+1;
                Node currNode = head;
        for (int i = 1; i <= posFromStart - 2; i++) {
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
    }


//    public void recursivePrintLL(){ // O(n) auxiliary space required for function call stack storage
//        if(head == null){
//            return;
//        }
//        System.out.print(head.data + " -> ");
//        recursivePrintLL(head.next);
//    }

    public static void main(String[] args) {
        ImplementationOfLL LL = new ImplementationOfLL();
        LL.addFirst(10);
        LL.addFirst(5);
        //LL.printLL();
        LL.addLast(15);
        LL.addLast(20);
        //LL.printLL();
        //LL.deleteFirst();
        //LL.printLL();
//        LL.reverseIterative();
//        LL.printLL();
//
//        LL.head = LL.reverseListRecursive(LL.head);
//        LL.printLL();
        LL.printLL();
        LL.deleteFromLast(2);
        LL.printLL();
        ImplementationOfLL.simpleFun();
    }
}
