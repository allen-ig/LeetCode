import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> list, int[] nums, int start){
        res.add(new ArrayList(list));
        for (int i = start; i < nums.length; i++){
            if (i > start && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            helper(res, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
