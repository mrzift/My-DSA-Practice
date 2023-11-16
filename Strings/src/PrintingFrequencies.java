public class PrintingFrequencies {
    public static void main(String[] args) {

        // Printing frequencies of characters in sorted order

        String s="geeksforgeeks";
        int count[]= new int[26];
        for (int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
        }
        for (int i=0; i<26;i++){
            if (count[i]>0) {
                System.out.println((char) (i + 'a') +" "+count[i]);

                // Printing a string in sorted order

//                for (int j = 0; j < count[i]; j++) {
//                    System.out.print((char) (i + 'a') +" ");
//                }


            }
        }
    }
}
