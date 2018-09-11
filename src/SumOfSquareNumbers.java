public class SumOfSquareNumbers {
    /**
     * time: O(sqrt(n))
     * space: O(1)
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;
        int start = 0, end = (int) Math.sqrt(c);
        while (start <= end){
            int temp = start * start + end * end;
            if (temp < c) start++;
            else if (temp > c) end--;
            else return true;
        }
        return false;
    }
}
