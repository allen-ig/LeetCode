public class NumberofSubarrayswithBoundedMaximum {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int res = 0, count = 0, index = 0;
        for (int i = 0; i < A.length; i++){
            int temp = 0;
            if (A[i] >= L && A[i] <= R){
                res += i - index + 1;
                count = i - index + 1;
            }else if (A[i] < L){
                res += count;
            }else{
                count = 0;
                index = i + 1;
            }
        }
        return res;
    }
}
