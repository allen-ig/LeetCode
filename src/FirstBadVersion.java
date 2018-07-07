public class FirstBadVersion {
    /**
     * time: O(logn)
     * space: O(1)
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high){
            int mid = (high - low) / 2 + low;
            if (isBadVersion(mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    private boolean isBadVersion(int version){
        return true;
    }
}
