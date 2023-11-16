public class CheckSubsequence {
    public static boolean isSubSequence(String A, String B)
    {
        //code here
        int j = 0;
        for (int i = 0; i<B.length() && j<A.length(); i++){
            if(B.charAt(i)==A.charAt(j)){
                j++;
            }
        }
        System.out.println(j);
        if(j==A.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "gksrek";
        String b = "geeksforgeeks";

        boolean smth = isSubSequence(a,b);
        System.out.println(smth);
    }
}
