public class FindTheDuplicateNumber {
    /**
     * time: O(nlogn)
     * space: O(1)
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums){
        int low = 0, high = nums.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int num : nums) if (num <= mid) count++;
            if (count <= mid) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    /**
     * second solution using Find Circle in LinkedList
     * time: O(n)
     * space: O(1)
     */
    public int findDuplicate2(int[] nums) {
        int n = nums.length;
        for(int i=0;i<nums.length;i++) nums[i]--;
        int slow = n-1;
        int fast = n-1;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        slow = n-1;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow+1;
    }

}
