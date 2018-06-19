public class ArrangingCoins {
    /**
     * time: O(logn)?
     * space: O(1）
     * @param n
     * @return
     */
    public int arrangeCoins(int n) {
        int i = 1;
        while (n >= 0){
            n -= i;
            i++;
        }
        return i - 2;
    }
}
