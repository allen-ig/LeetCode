import java.util.*;

public class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, nums, 0);
        return res;
    }

    private void helper(List<List<Integer>> res, int[] nums, int start){
        if (nums == null || nums.length == 0) return;
        if (start == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int num: nums){
                list.add(num);
            }
            res.add(new ArrayList<>(list));
            return;
        }
        Set<Integer> used = new HashSet<>();
        for (int i = start; i < nums.length; i++){
            if (used.add(nums[i])){
                swap(nums, start, i);
                helper(res, nums, start + 1);
                swap(nums, start, i);
            }
        }
    }

    private void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
