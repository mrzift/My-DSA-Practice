public class Nto1 {
    /// Returns numbers from N to 1.
    public static void Nto1(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        Nto1(n-1);
    }
    public static void main(String [] args){
        int n=5;
        Nto1(n);
    }
}
