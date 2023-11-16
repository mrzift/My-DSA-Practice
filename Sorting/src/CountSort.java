public class CountSort {

    public static void countSort(int arr[], int n, int k){
        int count[]=new int[k];
        for(int i=0; i<k; i++){
            count[i]=0;
        }
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        for(int i=1; i<k; i++){
            count[i]=count[i-1]+count[i];
        }
        int op[]=new int[n];
        for(int i=n-1; i>=0; i--){
            op[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for (int i=0; i<n; i++){
            arr[i]=op[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={1,4,4,1,0,1};
        int n=6, k=5;
        countSort(arr, n,k);
    }
}
