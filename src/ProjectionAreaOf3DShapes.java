public class ProjectionAreaOf3DShapes {
    /**
     * time: O(n ^ 2)
     * space: O(1)
     * @param grid
     * @return
     */
    public int projectionArea(int[][] grid) {
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < grid.length; i++){
            int maxx = 0;
            int maxy = 0;
            for (int j = 0; j < grid[0].length; j++){
                maxx = Math.max(maxx, grid[j][i]);
                maxy = Math.max(maxy, grid[i][j]);
                if (grid[i][j] > 0) z++;
            }
            x += maxx;
            y += maxy;
        }
        return x + y + z;
    }
}
