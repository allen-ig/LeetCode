import java.util.HashSet;

public class FirstMissingPositive {
    /**
     * time: O(n)
     * space: O(n)
     * @param nums
     * @return
     */
    public int firstMissingPositive(int[] nums){
        if (nums == null || nums.length == 0) return 1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i <= nums.length; i++){
            if (!set.contains(i + 1)) return i + 1;
        }
        return nums.length;
    }
}
