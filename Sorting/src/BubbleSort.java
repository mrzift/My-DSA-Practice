public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int temp=0;
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j+1]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,5,2,1,6,7};
        bubbleSort(arr);
    }
}
