public class LQS {
    public static void lqs(int arr[], int low, int high){

        LomutoPartition lp = new LomutoPartition();

        if(low<high){
            int p = lp.lomutoPartition(arr, low, high);
            lqs(arr,low, p-1);
            lqs(arr, p+1, high);
        }
    }

    public static void main(String[] args) {

        int arr[] = {10, 80, 30, 90, 40, 50, 70};

        int n = arr.length;
        lqs(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");

    }
}
