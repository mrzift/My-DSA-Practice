public class NaivePartition {
    public static void naivePartion(int arr[], int l, int h, int p){
        // It uses O(n) aux space. O(n) time.

        int temparr[]=new int[h-l+1]; // h is the highest index position while l is the lowest index position
        int count=0;                 // we are using l and h so that the function can be used for sub array as well.

//        int temp = arr[p];    ** For doing partition around any element. **
//        arr[p]=arr[h];
//        arr[h]=temp;
//        p=h;

        for(int i=l; i<=h; i++){
            if(arr[i]<=arr[p]){
                temparr[count++]=arr[i];
            }
        }
        for(int i=l; i<=h; i++){
            if(arr[i]>arr[p]){
                temparr[count++]=arr[i];
            }
        }
        for(int i=l; i<=h; i++){
            arr[i]= temparr[i-l];
        }

    }
    public static void main(String[] args) {
        int arr[] = {3, 8, 6, 12, 10, 7};
        int p = 5; // p is pivot element.
        int l = 0;
        int h = 5;
        naivePartion(arr, l, h, p);
        for (int i = 0; i <= h; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
