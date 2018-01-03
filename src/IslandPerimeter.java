public class IslandPerimeter {
    private int m;
    private int n;
    private int res = 0;
    private int count;
    public int islandPerimeter(int[][] grid) {
        m = grid.length;
        if(m == 0) return 0;
        n = grid[0].length;
        if(grid == null || n == 0) return 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }
    //0100
    //1110
    //0100
    //1100
    private void dfs(int[][] grid, int x, int y){
        int count = 4;
        if(x < 0 || y < 0 || grid[x][y] == 0 || x >= m || y >= n) return;
        if(grid[x][y] == 1) grid[x][y] = 2;
        if(x == 0) {count++; count--;}
        //System.out.println("x = 0" + count);
        if(y == 0) {count++; count--;}
        //System.out.println("y = 0" + count);
        if(x == m - 1) {count++; count--;}
        //System.out.println("x = max" + count);
        if(y == n - 1) {count++; count--;}
        //System.out.println("y = max" + count);
        if(x != 0 && grid[x - 1][y] != 0) count--;
        if(x < m - 1 && grid[x + 1][y] != 0) count--;
        if(y != 0 && grid[x][y - 1] != 0) count--;
        if(y < n - 1 && grid[x][y + 1] != 0) count--;
        res += count;
        //System.out.println(res);
    }
}


