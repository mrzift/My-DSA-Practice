import java.util.*;
public class Main {
    public static int maxwealth(int arr[][], int m, int n) {
    int maxsum=0;
        for(int i=0; i<m; i++){
            int sum=0;
            for(int j=0; j<n; j++){
                sum=sum+arr[i][j];
            }
            maxsum=Math.max(maxsum,sum);
        }
    return maxsum;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int m=2;
     int n=3;
    int arr[][]=new int[m][n];
    for(int i=0; i<m; i++){
        System.out.println("New Row");
        for(int j=0; j<n; j++){
            System.out.println("Enter a number in column");
            arr[i][j] = sc.nextInt();
        }
    }
        System.out.println(Arrays.deepToString(arr));
        int smth=maxwealth(arr,m,n);
        System.out.println(smth);
    }

}