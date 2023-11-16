public class Duplicate {
    public static void dupli(int arr[]){ // efficient solution. TC: O(n)
        int firstele = 1; // First element is fixed that is zero position.
        int count=1;
        for (int i=1; i<arr.length; i++){
            if(arr[i]!=arr[firstele-1]){ // If the element is different from 1st element then we place it in front of
                // previously sorted element and if the element is same than we ignore it.
                arr[firstele]=arr[i];
                firstele++;
                count++;
            }
        }
        for(int j=0; j<count; j++){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args){
    int arr[]= {10,20,20,30,30,30};
    dupli(arr);
    }
}
