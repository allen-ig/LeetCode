public class CountingBits {
    /**
     * time: O(n)
     * space: O(n)
     * @param num
     * @return
     */
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i / 2];
            if (i % 2 == 1) res[i]++;
        }
        return res;
    }
}
