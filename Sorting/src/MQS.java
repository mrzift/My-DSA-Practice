public class MQS {
    public static void mqs(int arr[], int low, int high){

        HoarePartition hp = new HoarePartition();

        if(low<high){
            int p = hp.hoarePartition(arr, low,high);
            mqs(arr,low, p);
            mqs(arr, p+1, high);
        }
    }

    public static void main(String[] args) {

        int arr[] = {10, 80, 30, 30, 40, 50, 70};

        int n = arr.length;
        mqs(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");

    }
}
