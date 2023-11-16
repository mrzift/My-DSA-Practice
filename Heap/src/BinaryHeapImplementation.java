public class BinaryHeapImplementation { // Implementing MinHeap
    int arr[];
    int size;
    int capacity;
    BinaryHeapImplementation(int capacity){
        arr = new int[capacity];
        size=0;
        capacity = capacity;
    }
    int left(int i){ // left of ith node
        return 2*i+1;
    }
    int right(int i){ // right of ith node
        return 2*i+2;
    }
    int parent(int i){ // parent of ith node
        return (i-1)/2;
    }

    void insert(int x){ // T.C is O(log (size))
        if(size == capacity){
            System.out.println("BH is completely filled");
            return;
        }
        size++;
        arr[size-1]=x;
        for(int i=size-1; i!=0 && arr[parent(i)]> arr[i]; i=parent(i)){
                int temp = arr[parent(i)];
                arr[parent(i)]=x;
                x = temp;
        }
    }

    void minHeapify(int i){ // i is the index of the element that violates the binary heap.
        int lt = left(i);   // here lt and rt gives index of left and right child
        int rt = right(i);
        int smallest = i;

        if (lt<size && arr[lt]<arr[i]){
            smallest = lt;
        }
        if (rt<size && arr[rt]<arr[smallest]){
            smallest = rt;
        }
        if(smallest !=i){
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

            minHeapify(smallest);
        }
    }

}
