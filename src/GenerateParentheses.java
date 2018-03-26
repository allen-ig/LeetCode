import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(res, "", 0, 0, n);
        return res;
    }

    private void helper(List<String> res, String str, int start, int end, int n){
        if (str.length() == 2 * n) {
            res.add(str);
        }
        if (start < n){
            helper(res, str + "(", start + 1, end, n);
        }
        if (end < start){
            helper(res, str + ")", start, end + 1, n);
        }
    }
}
