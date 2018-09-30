public class PartitionArrayIntoDisjointIntervals {
    public int partitionDisjoint(int[] A) {
        int res = 0;
        int leftmax = A[0];
        int max = leftmax;
        for (int i = 1; i < A.length; i++){
            if (A[i] < leftmax){
                leftmax = max;
                res = i;
            }else max = Math.max(max, A[i]);
        }
        return res + 1;
    }
}
