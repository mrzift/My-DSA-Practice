public class SecondLargestElement {
    public static int getLargest(int arr[]) {
        int res=0;
        for(int i=1; i< arr.length; i++){
            if(arr[i]>arr[res])
                res=i;
        }
        return res;
    }

    public static int secondLargest(int arr[]){ //*** Less efficient solution. TC=O(n^2)
       int largest = getLargest(arr);
       int res=-1; // It can return -1 because there may not be a 2nd largest element. Eg [10,10,10]
       for(int i=0; i<arr.length; i++){
           if(arr[i]!=arr[largest]){ // since we already know the largest element, we now look for elements which
               // are not equal to the largest element, i.e, they are smaller than the largest element.
               if (res==-1){
                   res=i;   // assigns the first not-equal element to result.
               }
               else if (arr[i]>arr[res]) {
                  res=i;   // here we check if the new number is greater than the previous set result.
               }
           }
       }
       // Here it returns the index of the element and not the element itself.
        return res;
    }


    public static int secondLargestbetter(int arr[]){ //*** Efficient solution. TC = O(n)
        int res=-1;
        int largest = 1;
        for (int i =0; i< arr.length;i++){
            if(arr[i]>arr[largest]){  // we set 1 as the largest no. If we find a number greater than 1 then
                // we set that number as the largest and the previous number as the second largest.
                res = largest;
                largest=i;
            }
            // In case the number is equal to the largest number than we simply ignore that number.
            else if (arr[i]<arr[largest]) {
                if( res == -1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return arr[res];
    }

    public static void main(String[] args){
    int arr[]= {20,20,15};
    int smth = secondLargestbetter(arr);
        System.out.println(smth);
    }
}
