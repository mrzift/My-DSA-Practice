public class MergeSort {
    public static void mergeSort(int arr[],int l, int r){

        if(r>l) {

            int m = l + (r - l) / 2; // middle index number.

            MergeFunction mf = new MergeFunction(); // creating an object of class MergeFunction

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            mf.mergeFunc(arr, l, r, m); // using the method of class MergeFunction
        }
    }
    public static void main (String args[]){

        int arr[] = {10,15,20,40,8,11,15,22,25};
        int l=0,r=8;
        mergeSort(arr, l, r);
        for(int b=0;b<=r; b++){
            System.out.print(arr[b]+" ");
        }

    }
}
