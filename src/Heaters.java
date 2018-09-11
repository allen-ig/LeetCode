import java.util.Arrays;

public class Heaters {
    /**
     * time: O(mlogn)
     * space: O(n)
     * @param houses
     * @param heaters
     * @return
     */
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int res = 0;
        for (int house : houses) {
            int start = 0;
            int end = heaters.length - 1;
            int mid = 0;
            while (start + 1 < end) {
                mid = start + (end - start) / 2;
                if (house < heaters[mid]) end = mid;
                else if (house > heaters[mid]) start = mid;
                else {
                    start = mid;
                    break;
                }
            }
            if (heaters[start] == house || heaters[end] == house) {
                res = Math.max(0, res);
                continue;
            }
            res = Math.max(res, Math.min(Math.abs(heaters[start] - house), Math.abs(heaters[end] - house)));
        }
        return res;
    }
}
