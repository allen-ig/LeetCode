import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    result[0]=Math.min(i,j);
                    result[1]=Math.max(i,j);
                    break;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target){
        if (nums == null || nums.length < 2){
            return new int[] {-1, -1};
        }
        int[] res = new int[] {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
