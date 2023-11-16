import java.util.ArrayList;
public class SubArrayWithGivenSum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> li = new ArrayList<>();// initialize an empty ArrayList to store the result
        int st = 0, sum = 0;// initialize two variables to keep track of the start and current sum of the subarray
        for(int i = 0; i<n; i++)// iterate through the n
        {
            sum += arr[i]; // add the current element to the sum
            while(sum > s){  // if the sum is greater than the target, remove elements from the start of the subarray
                sum -= arr[st];
                st++;
            }
            if(sum == s && sum!= 0)// if the sum is equal to the target and not equal to 0
            {
                li.add(st+1); // add the start index + 1 to the result
                li.add(i+1); // add the end index + 1 to the result
                return li; // return the result
            }
        }
        li.add(-1); // if a subarray is not found, add -1 to the result
        return li; // return the result
    }
    public static void main(String args[]){
        int arr[]={1,2,3,7,5};
        int n=5;
        int s=12;
        System.out.println(subarraySum(arr,n,s));
    }
}
