import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int num1 = nums[0];
        int num2 = nums[0];
        int count1 = 1;
        int count2 = 0;
        for (int val : nums){
            if (val == num1) count1++;
            else if (val == num2) count2++;
            else if (count1 == 0){
                num1 = val;
                count1++;
            }else if (count2 == 0){
                num2 = val;
                count2++;
            }else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int val : nums){
            if (val == num1) count1++;
            else if (val == num2) count2++;
        }
        if (count1 > nums.length / 3) res.add(num1);
        if (count2 > nums.length / 3) res.add(num2);
        return res;
    }
}
