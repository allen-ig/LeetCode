public class HIndex {
    /**
     * time: O(n)
     * space: O(n)
     * @param citations
     * @return
     */
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) return 0;
        int n = citations.length;
        int[] temp = new int[n + 1];
        for (int citation : citations) {
            if (citation > n) temp[n]++;
            else temp[citation]++;
        }
        if (temp[n] >= n) return n;
        for (int i = n - 1; i >= 0; i--){
            temp[i] += temp[i + 1];
            if (temp[i] >= i) return i;
        }
        return 0;
    }
}
