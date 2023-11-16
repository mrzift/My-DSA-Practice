import java.util.Queue;

class Queue4{
    int size;
    int front;
    int rear;
    int arr[];
    public Queue4(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public boolean isFull(){
        return front == (rear+1)%size;
    }
    public void add(int data){
        if(isFull()){
            System.out.println("Full Queue");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        int res = arr[front];

        // when only 1 element is present
        if (rear == front){
            rear = front = -1;
        }
        else {
            front = (front+1)%size;
        }
        return res;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[front];
    }

}
public class CircularQueueUsingArray {
    public static void main(String[] args) {
        Queue4 q = new Queue4(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.remove();
        System.out.println(q.peek());
        q.remove();
        q.add(50);
        q.add(60);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }

}
