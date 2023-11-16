public class ReversingWords {

    public static void reverseWord(String s, int n){
        char str [] = s.toCharArray();
        int start=0;
        for(int end=0; end<n; end++){
            if(str[end]==' '){
                reverse(str, start, end-1);
                start = end+1;
            }
        }
        reverse(str, start, n-1);
        reverse(str, 0, n-1);
        System.out.println(str);
    }
    public static void reverse(char arr[], int low, int high){
        while(low<=high){
            char temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

    //// Improved Naive Search -  O(n) because whatever iteration we do inside that many we skip outside

    static void improvedPatSearching(String txt,String pat){
        int m=pat.length();
        int n=txt.length();
        for(int i=0;i<=(n-m);  ){
            int j;
            for(j=0;j<m;j++)
                if(pat.charAt(j)!=txt.charAt(i+j))
                    break;

            if(j==m)
                System.out.print(i+" ");
            if(j==0){
                i++;}
            else{
                i=(i+j);}
        }
    }


    public static void main(String[] args) {
        String s = "welcome to gfg";
        int n = s.length();
        reverseWord(s,n);
    }
}
