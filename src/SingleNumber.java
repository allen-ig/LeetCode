import java.util.ArrayList;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < nums.length; i++){
            if (res.contains(nums[i])){
                temp -= nums[i];
            }else {
                res.add(nums[i]);
                temp += nums[i];
            }
        }
        return temp;
    }

    public int singleNumber2(int[] nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}
