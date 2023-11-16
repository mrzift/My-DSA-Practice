public class Main {
    public static int bsearch(int arr[], int x, int low, int high){
        if (low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]==x) {
            if(mid==0)
                return mid;
            else if(arr[mid-1]==x){
                return bsearch(arr, x, low, mid-1);
            }
            else
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
        int arr[]={5,5,5};
        int x = 5;
        int low=0;
        int high = arr.length-1;
        int smth = bsearch(arr, x,low, high);
        System.out.println(smth);
    }
}