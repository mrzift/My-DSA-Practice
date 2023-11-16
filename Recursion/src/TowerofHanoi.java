public class TowerofHanoi {
    public static void ToH(int n, int A, int B, int C){
        if (n==1){
            System.out.println("Move disk 1 from rod " + A + " to " + C);
            return;
        }
        ToH(n-1,A ,C, B);
        System.out.println("Move disk " + n + " from rod " + A + " to " + C);
        ToH(n-1,B, A, C);
    }
    public static void main(String [] args){
        int n=3;
        int A = 1;
        int B = 2;
        int C = 3;
        ToH(n, A, B, C);

    }
}
