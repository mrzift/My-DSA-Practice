import java.util.ArrayList;
import java.util.List;

public class PrintPattern {

//    static List<Integer> pattern(int N){
//        List<Integer> list = new ArrayList<Integer>();
//        pattern(N, list, 0);
//        return list;
//    }
//
//    private static void pattern(int N, List<Integer> list, int index) {
//        if(N <= 0) {
//            // just add 1 element in the list when we meet 0 or less and return
//            list.add(index, N);
//            return;
//        };
//        // keep adding every N 2 times in the list
//        list.add(index, N);
//        //System.out.println(list.get(index));
//        list.add(index, N);
//        //System.out.println(list.get(index));
//        // keep calling further by  subtracting 5 and increasing index to add
//        pattern(N - 5, list, index + 1);
//    }

//    static List<Integer> ans;
//    static boolean flag;
//
//    static List<Integer> pattern(int N){
//        ans = new ArrayList<Integer>();
//        flag = false;
//        ans.add(N);
//        if(N<=0){
//            return ans;
//        }
//        patt(N);
//
//        return ans;
//    }
//
//    static void patt(int N){
//        if(flag==false){
//            ans.add(ans.get(ans.size()-1)-5);
//            if(ans.get(ans.size()-1)<=0){
//                flag=true;
//            }
//            patt(N);
//        }
//        else{
//            ans.add(ans.get(ans.size()-1)+5);
//            if(ans.get(ans.size()-1)==N){
//                return;
//            }
//            patt(N);
//        }

    static List<Integer> pattern(int N){
        List<Integer> ans = new ArrayList<Integer>();
        printPattern(N, ans);

        return ans;
    }

    static void printPattern(int n, List<Integer> list)
    {

        // Base case (When n becomes 0 or
        // negative)
        if (n == 0 || n < 0) {
            list.add(n);
            return;
        }

        // First print decreasing order
        list.add(n);

        printPattern(n - 5, list);

        // Then print increasing order
        list.add(n);
    }
    public static void main(String[] args) {
        int n=10;
        // System.out.println(pattern(n));
        List<Integer> l = new ArrayList<>();
        l.add(0,5);
        l.add(0,3);
        l.add(0,7);
        System.out.println(l);
    }
}
