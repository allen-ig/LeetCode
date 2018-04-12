import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * time: O(nlogn)
 * space: O(1)
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }

    /**
     * time: O(n)
     * space: O(n)
     * @param nums
     * @return
     */

    private boolean containsDuplicate2(int[] nums){
        Set<Integer> single = new HashSet<>();
        for (int num : nums){
            if (single.contains(num)){
                return true;
            }
            single.add(num);
        }
        return false;
    }
}
