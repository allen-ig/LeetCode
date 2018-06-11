import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    /**
     * time: O(n)
     * space: O(1)
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++){
            int temp = Math.abs(nums[i]) - 1;
            if (nums[temp] > 0) nums[temp] = -nums[temp];
        }
        for (int i = 0; i < n; i++){
            if (nums[i] > 0) res.add(i + 1);
        }
        return res;
    }
}
