public class MergeFunction {
    public static void mergeFunc(int arr[], int l, int r, int m){

        /// m is not mid-index value here. It is the point around which
        /// both half of the array is sorted.

        int n1= m-l+1;
        int n2=r-m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0; i<n1; i++){
            left[i]=arr[l+i];  // l might not be zero all the time as merge sort can also be used to sort sub-arrays.
        }
        for(int j=0; j<n2; j++){
            right[j]=arr[m+1+j];
        }

        int i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while (i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }

    }
    public static void main(String[] args) {
        int arr[] = {10,15,20,40,8,11,15,22,25};
        int l=0,r=8,m=3;
        mergeFunc(arr, l, r, m);

    }
}
