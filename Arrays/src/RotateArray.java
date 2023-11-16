public class RotateArray {
    public static void rotate(int arr[], int d) {
        int temp;
        for (int j = 1; j <= d; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(" " + arr[j]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        rotate(arr, d);
    }
}

    //*** Best Solution ***//


//static void leftRotate(int arr[], int d, int n)
//{
//    reverse(arr, 0, d - 1);
//
//    reverse(arr, d, n - 1);
//
//    reverse(arr, 0, n - 1);
//
//}
//
//    static void reverse(int arr[], int low, int high)
//    {
//        while(low < high)
//        {
//            int temp = arr[low];
//            arr[low] = arr[high];
//            arr[high] = temp;
//
//            low++;
//            high--;
//        }
//    }
