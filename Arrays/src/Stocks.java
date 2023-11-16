public class Stocks {
    public static int stocks(int arr[]) {
        int profit=0;
        for(int i=0; i< arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                profit += arr[i+1]-arr[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int nums[]={10,20,30};
        int smth = stocks(nums);
        System.out.println(smth);


    }
}
