import java.util.HashSet;

public class SetMismatch {
    /**
     * time: O(n)
     * space: O(n)
     * @param nums
     * @return
     */
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int sum = 0;
        for (int i = 1; i <= nums.length; i++) sum += i;

        for (int num : nums){
            if (set.contains(num)) res[0] = num;
            sum -= num;
            set.add(num);
        }
        System.out.println(sum);
        res[1] = sum + res[0];
        return res;
    }
}
