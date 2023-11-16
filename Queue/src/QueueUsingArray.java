class Queue1{
    int size;
    static int rear=-1;
    int arr[];
    public Queue1(int n){
        this.size=n;
        arr = new int[n];
    }
    public boolean isEmpty(){
        if(rear == -1){ // this is empty queue condition
            System.out.println("Queue is empty");
            return true;
        }
        return false;
    }
    public void add(int data){ // enqueue --- O(1) TC.
        if(rear == size - 1){ // this is full queue condition
            System.out.println("Queue is full");
            return;
        }
        //rear++;
        arr[++rear]=data;
    }
    public int remove(){ // dequeue --- O(n) TC.
        if(rear == -1){ // this is empty queue condition
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];
        for (int i=0; i<rear; i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
    public int peek(){
        if(rear == size -1){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }
}
public class QueueUsingArray {
    public static void main(String[] args) {
        Queue1 queue1 = new Queue1(5);
        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);
        while(!queue1.isEmpty()){
                System.out.println(queue1.peek());
            queue1.remove();
        }
        queue1.add(50);
        System.out.println(queue1.peek());
    }
}
