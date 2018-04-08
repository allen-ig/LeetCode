public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 1;
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (count == 0){
                res = nums[i];
                count++;
            }else{
                if (nums[i] == res) count++;
                else count--;
            }
        }
        return res;
    }
}
