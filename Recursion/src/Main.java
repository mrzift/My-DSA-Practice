import java.util.Scanner;
public class Main {
   public static void genSub(String s, String curr, int index){
        if(index==s.length()) {
            System.out.print(curr + " ");
            return;
        }
       genSub(s, curr+s.charAt(index), index+1);
        genSub(s, curr, index+1);

    }
        public static void main (String[]args){
        String s = "ABC";
        String curr = "";
        int index = 0;
        genSub(s, curr, index);
        }

}

