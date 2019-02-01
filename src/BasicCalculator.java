import java.util.Stack;

public class BasicCalculator{
        public int calculate(String s) {
            int temp = 0, res = 0, sign = 1;
            Stack<Integer> stack = new Stack<>();
            for (char c : s.toCharArray()){
                if (Character.isDigit(c)){
                    temp = temp * 10 + c - '0';
                }else if (c == '+'){
                    res += sign * temp;
                    sign = 1;
                    temp = 0;
                }else if (c == '-'){
                    res += sign * temp;
                    sign = -1;
                    temp = 0;
                }else if (c == '('){
                    stack.push(res);
                    stack.push(sign);
                    sign = 1;
                    res = 0;
                }else if (c == ')'){
                    res += sign * temp;
                    temp = 0;
                    res *= stack.pop();
                    res += stack.pop();
                }
            }
            if (temp != 0) res += sign * temp;
            return res;
        }
}
