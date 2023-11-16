public class LeftMostRepeatingChar {

    ///////Better Approach/////(There is also a naive approach)

    public static int leftMostRepeating(String s){
        int cha = 256;
        int count[] = new int[cha];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)]++;
        }
        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }

    /////// Efficient Approach //////


    // IDEA:- we have a boolean array. we traverse the string from right and when we see a character for the
    // first time then we set it to true. and if we see the character again then we set the result to the index
    // of that character. the advantage of transversing from the right is that the last result value will be
    // the value of left most repeating character and we don't need to do any comparing.
    static final int CHAR=256;
    static int leftMost(String str)
    {
        boolean[] visited=new boolean[CHAR];
        int res=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)])
                res=i;
            else
                visited[str.charAt(i)]=true;
        }

        return res;

    }

    public static void main(String[] args) {
        String s = "abcbcd";
        int smth = leftMostRepeating(s);
        System.out.println(smth);
    }
}
