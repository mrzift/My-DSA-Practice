import java.util.Stack;

public class BalancedParenthesis {
    static boolean isMatch(char a, char b){
        if((a == '(' && b ==')') || (a == '{' && b =='}') || (a == '[' && b ==']')){
            return true;
        }
        return false;
    }
    static boolean isBalanced(String s)    {
        Stack<Character> st = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else{
                if (st.empty()){
                    return false;
                }
                else if (c == ')' && st.peek() != '(') {
                    return false;
                }
                else if (c == ']' && st.peek() != '[') {
                    return false;
                }
                else if (c == '}' && st.peek() != '{') {
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        String s = "([])";
//        boolean smth = balancedParenthesis(s);
//        System.out.println(smth);

    }
}
