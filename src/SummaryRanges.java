import java.util.ArrayList;
import java.util.List;

/**
 * Time: O(n)
 * Space: O(1)
 */

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int temp = nums[i];
            while (i < nums.length && nums[i + 1] - nums[i] == 1){
                i++;
            }
            if (temp == nums[i]){
                res.add(Integer.toString(nums[i]));
            }else {
                res.add(temp + "->" + nums[i]);
            }
        }
        return res;
    }
}
