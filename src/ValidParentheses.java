import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '('){
                chars.push(')');
            }else if (c == '{'){
                chars.push('}');
            }else if (c == '['){
                chars.push(']');
            }else if (chars.isEmpty() || chars.pop() != c){
                return false;
            }
        }
        return chars.isEmpty();
    }
}
