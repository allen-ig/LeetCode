public class HouseRobber {
    public int rob(int[] nums) {
        int yes = 0;
        int no = 0;
        for (int num: nums){
            int curr = no + num;
            no = Math.max(no, yes);
            yes = curr;
        }
        return Math.max(yes, no);
    }
}
