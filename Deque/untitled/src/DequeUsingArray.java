class Dequ{
    int size;
    int front=-1;
    int rear = -1;
    int arr[];
    public Dequ(int size){
        this.size = size;
        arr = new int[size];
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return front == (rear+1)%size;
    }

    public void addFirst(int data){ // GFG method.
        if(front == -1){
            front = 0;
            arr[front]= data;
            return;
        }
        if (isFull()){
            System.out.println("Full Queue");
        }
        front = (front - 1 + size) % size; // Important concept. (GFG)
        arr[front]= data;
    }

    public void addLast(int data){
        if (isFull()){
            System.out.println("Full Queue");
        }
        if(front == -1){ // in case of first element. because when we add the first element to the rear it becomes the front element.
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear]=data;
    }


//    public void addFirst(int data){  // ---> my method
//        if (isFull()){
//            System.out.println("Full Queue");
//        }
//        if(front == -1){ // in case of first element. because when we add the first element to the rear it becomes the front element.
//            front = 0;
//            arr[front] = data;
//            return;
//        }
//        if(front == 0 ){
//            front = size -1;
//        }
//        else if(front>0){
//            front--;
//        }
//        arr[front] = data;
//    }


    public int removeFirst(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        int res = arr[front];
        front = (front+1)%size;
        // when only 1 element is present
//        if (rear == front){
//            rear = front = -1;
//        }
//        else {
//            front = (front+1)%size;
//        }
        return res;
    }
    public int removeLast(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        int res = arr[rear];
        rear = (rear - 1 + size) % size;
        return res;
    }

    public int getFront(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[front];
    }

    public int getRear(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[rear];
    }

}
public class DequeUsingArray {
    public static void main(String[] args) {
        Dequ dq = new Dequ(7);
        dq.addFirst(30);
        dq.addLast(40);
        dq.addFirst(20);
        dq.addLast(50);
        dq.addFirst(10);
        dq.addFirst(5);
        dq.addLast(60);
        while (!dq.isEmpty()){
            System.out.println(dq.getRear());
            dq.removeLast();
        }
    }
}
