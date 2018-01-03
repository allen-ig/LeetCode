import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfaPhoneNumber {
    private String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits){
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return res;
        }
        helper(res, digits, "", 0);
        return res;
    }

    public List<String> helper(List<String> res, String digits, String s, int index){

    }
}
