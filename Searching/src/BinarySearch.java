public class BinarySearch {

//    ITERATIVE SOLUTION
//    int binarySearch(int arr[], int x)
//    {
//        int l = 0, r = arr.length - 1;
//        while (l <= r) {
//            int m = l + (r - l) / 2;
//
//            // Check if x is present at mid
//            if (arr[m] == x)
//                return m;
//
//            // If x greater, ignore left half
//            if (arr[m] < x)
//                l = m + 1;
//
//                // If x is smaller, ignore right half
//            else
//                r = m - 1;
//        }
//
//        // if we reach here, then element was
//        // not present
//        return -1;
//    }

    public static int bsearch(int arr[], int x, int low, int high){
        if (low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]==x) {
            return mid;
        }
        else if(arr[mid]<x){
            return bsearch(arr, x, mid+1, high);
        }
        else {
            return bsearch(arr, x, low, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int x = 20;
        int low = 0;
        int high = arr.length-1;
        int smth = bsearch(arr, x,low, high);
        System.out.println(smth);
    }
}
