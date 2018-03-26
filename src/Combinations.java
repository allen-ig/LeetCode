import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        if (n == 0) return null;
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), 1, n, k);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> list, int start, int n, int k){
        if (k == 0) {
            res.add(new ArrayList(list));
            return;
        }
        else{
            for (int i = start; i <= n; i++){
                list.add(i);
                helper(res, list, i + 1, n, k - 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
