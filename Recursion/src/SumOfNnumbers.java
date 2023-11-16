public class SumOfNnumbers {
    public static int sumOFN(int n){
        if (n==0){
            return 0;
        }
        return n+sumOFN(n-1);
    }
    public static void main(String[] args) {
    int n=6;
    int smth= sumOFN(n);
        System.out.println(smth);
    }
}
