public class ThirdMaximumNumber {
    /**
     * time: O(n)
     * space: O(1)
     * Use type Long to handle min_value corner case
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int num : nums) {
            if (num == first || num == second || num == third) continue;
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }
        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}
