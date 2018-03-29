public class MissingNumber {
    /*
    sum solution
     */
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++){
            res += i;
            res -= nums[i];
        }
        return res;
    }
    /*
    xor
     */
    public int missingNumber2(int[] nums){
        int res = nums.length;
        for (int i = 0; i < nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }
}
