import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix3 {
    /**time: O(max(R, C) ^ 2)
     * space: O(R * C)
     * @param R
     * @param C
     * @param r0
     * @param c0
     * @return
     */
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int i = r0;
        int j = c0;
        int left = c0;
        int right = c0;
        int top = r0;
        int bottom = r0;
        List<int[]> res = new ArrayList<>();
        res.add(new int[]{r0, c0});
        while (left > 0 || right < C || top > 0 || bottom < R) {
            j++;
            right++;
            bottom++;
            top--;
            left--;
            while (i < bottom){
                if (i >= 0 && i < R && j >= 0 && j < C) res.add(new int[]{i, j});
                i++;
            }
            while (j > left){
                if (i >= 0 && i < R && j >= 0 && j < C) res.add(new int[]{i, j});
                j--;
            }
            while (i > top){
                if (i >= 0 && i < R && j >= 0 && j < C) res.add(new int[]{i, j});
                i--;
            }
            while (j < right){
                if (i >= 0 && i < R && j >= 0 && j < C) res.add(new int[]{i, j});
                j++;
            }
            if (i >= 0 && i < R && j >= 0 && j < C) res.add(new int[]{i, j});
        }
        return res.toArray(new int[R * C][2]);
    }
}
