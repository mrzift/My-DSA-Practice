public class CheckSubstrings {
    public static boolean checkSub(String s1, String s2){
        int j=0;
        for (int i=0; i<s1.length() && j<s2.length(); i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }
        return j==s2.length(); //avoids if and else conditions and makes
        // sure all the characters of 2nd substring is checked
    }
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="grk";
        boolean smth=checkSub(s1, s2);
        System.out.println(smth);
    }
}
