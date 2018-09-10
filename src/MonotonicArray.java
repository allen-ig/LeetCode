public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 1; i < A.length; i++){
            inc &= A[i - 1] <= A[i];
            dec &= A[i - 1] >= A[i];
        }
        return inc || dec;
    }
}
