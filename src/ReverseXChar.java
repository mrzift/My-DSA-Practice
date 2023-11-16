import java.util.Scanner;

public class ReverseXChar {

    public static String reverseAlternateNChars(String s, int n) {
        StringBuilder result = new StringBuilder();
        boolean reverse = true;

        for (int i = 0; i < s.length(); i += n) {
            if (reverse) {
                for (int j = Math.min(i + n - 1, s.length() - 1); j >= i; j--) {
                    result.append(s.charAt(j));
                }
            } else {
                result.append(s.substring(i, Math.min(i + n, s.length())));
            }
            reverse = !reverse;
        }

        return result.toString();
    }

    public static String reverseXChar(String s, int x) {
        String temp = "";
        int m=0;
        String ao;
        String bo;
        while (m < s.length()) {
            if(m+x > s.length()){
                ao = s.substring(m,s.length()-1);
            }
            else {
                ao = s.substring(m,m+x);
            }

            int n = x;
            while(n>0) {
                temp = temp + ao.charAt(n - 1);
                n--;
            }

            m=m+x;
            if(m+x > s.length()){
                bo = s.substring(m,s.length()-1);
            }
            else {
                bo = s.substring(m,m+x);
            }
            temp = temp + bo;
            m=m+x;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int x = sc.nextInt();

        String s = "Modassir";
        int x = 5;
        String smth = reverseAlternateNChars(s,x);

        System.out.println(smth);
    }
}
