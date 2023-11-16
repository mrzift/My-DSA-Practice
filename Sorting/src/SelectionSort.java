public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0; i< arr.length; i++){
            int min= i;
            int temp=0;
            for(int j=i+1; j< arr.length; j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,5,2,3,6,7};
        selectionSort(arr);
    }
}
