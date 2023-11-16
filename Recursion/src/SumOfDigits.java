public class SumOfDigits {
    public static int sumOfDigit(int n){
        if (n==0){
            return 0;
        }
        return n%10 + sumOfDigit(n/10);
    }
    public static void main(String[] args) {
        int n = 253;
        int smth = sumOfDigit(n);
        System.out.println(smth);
    }
}
