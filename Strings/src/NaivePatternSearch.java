public class NaivePatternSearch {
    public static void  naivePatternSearch(String word, String pattern){
        // Quadratic Time Algorithm - O((m-n+1)*n)
        int m = word.length();
        int n = pattern.length();
        for(int i=0; i<=m-n; i++){
            int j;
            for (j=0; j<n; j++ ){
                if(word.charAt(j+i)!=pattern.charAt(j))
                    break;
            }
            if(j==n){
                System.out.println(i);
            }
        }
    }

    public static void patternSearchLinear(String a, String b){
        int m = a.length();
        int n = b.length();
        for(int i=0; i<=m-n; i++){
            if (a.substring(i, n+i).equals(b))
                System.out.println(i);
        }

    }

    public static void main(String[] args) {
        String a = "ABCABCD";
        String b = "ABCD";
        patternSearchLinear(a,b);
    }
}
