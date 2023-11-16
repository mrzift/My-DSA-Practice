public class ZeroesToEnd {
 //   public static void zte(int arr[]){

        //*** Naive Solution ***//

//        int n = arr.length;
//        int res=0;
//        int zer=1;
//        int temp[] = new int[n];
//        for(int i=0; i<n; i++){
//            if(arr[i]!=0){
//                temp [res]= arr[i];
//                res++;
//            }
//            else if (arr[i]==0){
//                temp [n-zer]=arr[i];
//                zer++;
//            }
//        }
//        for (int j = 0; j<n; j++){
//            System.out.print(" " + temp[j]);
//        }

        //*** Better solution ***//

        // Function which pushes all zeros to end of an array.
        static void pushZerosToEnd(int arr[], int n)
        {
            int count = 0; // Count of non-zero elements

            // Traverse the array. If element encountered is
            // non-zero, then replace the element at index 'count'
            // with this element
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    arr[count++] = arr[i]; // here count is
                }
                // incremented
            }
            // Now all non-zero elements have been shifted to
            // front and 'count' is set as index of first 0.
            // Make all elements 0 from count to end.
            while (count < n)
                arr[count++] = 0;
        }


    public static void main(String args[]){
        int arr[]= {8,5,0,10,0};
        int n=5;
        pushZerosToEnd(arr,n);
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
