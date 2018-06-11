public class MaxAreaOfIsland {
    /**
     * time: O(mn)
     * space: O(1)
     * @param grid
     * @return
     */
    public int maxAreaOfIsland(int[][] grid) {
        int[] res = new int[1];
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1) dfs(grid, i, j, new int[1], res);
            }
        }
        return res[0];
    }

    private void dfs(int[][] grid, int i, int j, int[] count, int[] res){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return;
        if (grid[i][j] == 1){
            count[0]++;
            grid[i][j] = 0;
            dfs(grid, i + 1, j, count, res);
            dfs(grid, i - 1, j, count, res);
            dfs(grid, i, j + 1, count, res);
            dfs(grid, i, j - 1, count, res);
            res[0] = Math.max(res[0], count[0]);
        }
    }
}
