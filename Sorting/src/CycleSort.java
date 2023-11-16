public class CycleSort {
    public static void main (String[] args)
    {
        int arr[] = { 20,40,50,10,30 };
        int n = arr.length;
        cycleSortDistinct(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");

    }

    public static void cycleSortDistinct(int arr[], int n)
    {
        // Cycle Starts
        for(int cs=0;cs<n-1;cs++){ // we go to <n-1 cuz the last number is already sorted in the cycle, or it's the largest number.

            int item=arr[cs]; // this is the item to relocate
            int pos=cs;       // this is the position of the item
            for(int i=cs+1;i<n;i++)  // arranging first number in place.
                if(arr[i]<item)
                    pos++;
            //swap(item,arr[pos])
            int temp=item;
            item=arr[pos];
            arr[pos]=temp;

            while(pos!=cs){     // arranging the remaining numbers of the cycle in place.
                pos=cs;         // position set to 'cs' to check the numbers smaller than the current number.
                for(int i=cs+1;i<n;i++)
                    if(arr[i]<item)
                        pos++;
                //swap(item,arr[pos])
                temp=item;
                item=arr[pos];
                arr[pos]=temp;
            }
            // Cycle stops
        }
    }
}
