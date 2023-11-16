import java.util.HashSet;

public class Main {
    public static int distinctElement(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i< arr.length; i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int arr[]= {10,10,10};
        int smth = distinctElement(arr);
        System.out.println(smth);
    }
}