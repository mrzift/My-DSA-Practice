import java.util.Arrays;

public class Main {

    // Method 1: character array method
    // It requires nlog(n) time due to sorting of array
    public static boolean anagramCheck(String s1, String s2){
        if (s1.length()!=s2.length()) {
            return false;
        }
        char a1[]=s1.toCharArray();
        System.out.println(a1);
        Arrays.sort(a1);
        s1=new String(a1);

        char a2[]=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);

    return s1.equals(s2);
    }

    // Method 2: better method. single transversal so TC=O(n).
    static final int CHAR=256; // implies constant -- we can also just use 256.
    // here we are taking size as 256 to include all characters
    // the idea is that for every character in string1 we increase the count and for string2 we decrease the count.
    // at the end if all the elements in array is 0 then it is an anagram
    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int count[]=new int[CHAR];
        for (int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int j=0; j<CHAR; j++){
            if(count[j]!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1="abaac";
        String s2="aacba";
        boolean smth=checkAnagram(s1,s2);
        System.out.println(smth);
    }
}