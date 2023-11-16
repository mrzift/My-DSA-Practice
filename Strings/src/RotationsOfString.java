public class RotationsOfString {
    public static boolean arerotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String temp = s1 + s1;
        return temp.contains(s2);
        //return temp.indexOf(s2) != -1;

        ///// Rotate by 2 places. /////

//        if(s1.length()<=1)
//        {
//            if(s1.equals(s2))
//                return true;
//
//            else
//                return false;
//        }
//        if(temp.indexOf(s2) == 2 || temp.indexOf(s2)==(s2.length()-2)){
//            return true;
//        }
//        else
//            return false;
   }

    public static void main(String[] args) {
        String a = "ab";
        String b = "ab";
        boolean smth = arerotations(a,b);
        System.out.println(smth);
    }
}
