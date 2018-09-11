public class ValidPerfectSquare {
    /**
     * time: O(logn)
     * space: O(1)
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        long start = 1;
        long end = num;
        while (start <= end){
            long mid = start + (end - start) / 2;
            if (mid * mid < num) start = mid + 1;
            else if (mid * mid > num) end = mid - 1;
            else return true;
        }
        return false;
    }
}
