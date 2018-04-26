public class FactorialTrailingZeroes {
    /**
     * time: O(log(n))
     * 
     * @param n
     * @return
     */
    public int trailingZeroes(int n){
        return n >= 5 ? n / 5 + trailingZeroes(n / 5) : 0;
    }
}
