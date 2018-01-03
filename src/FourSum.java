
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int low = j + 1, high = nums.length - 1;
                while (low < high) {
                    int sum  = nums[i] + nums[j] + nums[low] + nums[high];
                    if (sum == target){
                        res.add(Arrays.asList(nums[i], nums[j], nums[high], nums[low]));
                        while (nums[low] == nums[low + 1]) low++;
                        while (nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    }
                    else if (sum < target) low++;
                    else high--;
                }
            }
        }return res;
    }
}

class Solution {
    public List<List<Integer>> fourSum (int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int k = j + 1, l = nums.length - 1;
                while ( k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        while (k < l && nums[k] == nums[k + 1]) k++;
                        while (k < l && nums[l - 1] == nums[l]) l--;
                        k++;
                        l--;
                    }else if (sum > target)
                        l--;
                    else
                        k++;
                }
                while (j < nums.length - 2 && nums[j] == nums[j + 1]) j++;
            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) i++;
        }
        return res;
    }
}