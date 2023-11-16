import java.util.Scanner;
public class LPImplementation {

    public static void main(String args[]){
        int size = 7;
        int filled =0;
        int arr[] = {49,50,51,63,-1,-1,69};
        System.out.println("Enter the Key");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        System.out.println(delete(arr,key,size));
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int hashFunc(int key, int size){

        return key % size;
    }


    public static boolean search(int arr[],int key, int size){
    int h = hashFunc(key, size);
    int i=h;
    while(arr[i] != -1) { // -1 means empty slot.
        if (arr[i] == key) {
            return true;
        }
        i=(i+1)%size; // checking at next probe.
        if(i==h) {    // search complete, element not found.
            return false;
        }
    }
        return false;
    }

    public static boolean insert(int arr[], int key, int size, int filled){

        if(size==filled)
            return false;

        int i = hashFunc(key, size);
        while (arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key) {
         i=(i+1)%size;
        }
        if(arr[i]==key){
            return false;
        }
        else {
            arr[i] = key;
            return true;
        }
    }

    public static boolean delete(int arr[], int key, int size){
        int h=hashFunc(key, size);
        int i=h;
        while (arr[i]!=-1 && arr[i]!=-2){
            if (arr[i]==key) {
                arr[i] = -2;
                return true;
            }
            i=(i+1)%size;
            if(i==h)
                return false;
        }

        return false;
    }

}
