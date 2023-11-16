public class HoarePartition {
    public static int hoarePartition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;

        while (true)
        {
            // Find leftmost element greater
            // than or equal to pivot
            do {
                i++;
            } while (arr[i] < pivot);

            // Find rightmost element smaller
            // than or equal to pivot
            do {
                j--;
            } while (arr[j] > pivot);

            // If two pointers met.
            if (i >= j)
                return j;

            // swap(arr[i], arr[j]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }

    public static void main(String[] args) {

        int arr[] = new int[]{50, 80, 30, 90, 40, 10, 70};
        int high = arr.length-1;
        int smth = hoarePartition(arr, 0, high);
        System.out.println(smth);
        for (int x : arr) {
            System.out.print(x + " ");
        }


    }
}
