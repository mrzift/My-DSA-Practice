public class MaxDifference {
    public static int maxdiff(int arr[])
    {
        int res=arr[1]-arr[0];
        int minval=arr[0];
        for (int i=1; i< arr.length; i++){
            res = Math.max(res, arr[i]-minval);
            minval = Math.min(minval,arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[]={10,20,30};  ///-2,3,-1,2,-2
        int smth = maxdiff(nums);
        System.out.println(smth);
    }
}
