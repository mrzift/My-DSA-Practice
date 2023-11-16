public class LargestElement {
    public static int LarEle(int arr[]) {
// Naive solution... TC: O(n^2)
//        for (int i = 0; i < arr.length; i++) {
//            boolean flag = true;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] > arr[i]) { // if there is a greater element then we break out of the loop.
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag == true) {
//                return arr[i];
//            }
//        }
//        return -1;

        // Better solution... TC: O(n)
        int res=0;
     for(int i=1; i< arr.length; i++){
         if(arr[i]>arr[res])
             res=i;
     }
     return arr[res];
    }
    public static void main(String[] args) {
        int arr[]={5,8,20,10,30};
        System.out.println(LarEle(arr));
    }
}
