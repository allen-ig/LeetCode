import java.util.LinkedList;
import java.util.List;

public class PancakeSorting {
    /**
     * time: O(n^2)
     * make 2^n flips
     * @param A
     * @return
     */
    public List<Integer> pancakeSort(int[] A) {
        int n = A.length;
        int curr = n;
        List<Integer> res = new LinkedList<>();
        for (int i = n; i > 0; i--){
            int maxIndex = findMaxIndex(A, i);
            pancakeFlip(maxIndex, A);
            res.add(maxIndex + 1);
            pancakeFlip(curr - 1, A);
            res.add(curr--);
        }
        return res;
    }

    private void pancakeFlip(int k, int[] nums){
        int i = 0, j = k;
        while (i < j){
            swap(nums, i++, j--);
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int findMaxIndex(int[] nums, int bound){
        int index, i;
        for (index = 0, i = 0; i < bound; i++){
            if (nums[index] < nums[i]) index = i;
        }
        return index;
    }
}
