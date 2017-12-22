class Solution {
	private int m;
	private int n;
    public int numIslands(char[][] grid) {
        int res = 0;
		m = grid.length;
		if(m == 0) return 0;
		n = grid[0].length;
		if(grid == null ||  n == 0) return 0;
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				if(grid[i][j] == '1'){
					dfs(grid, i, j);
					res++;
				}
			}
		}
		return res;
    }
	
	private void dfs(char[][] grid, int x, int y){
		if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] = '0') return;
		if(grid[x][y] == '1'){
			grid[x][y] = '0';
			dfs(grid, x + 1, y);
			dfs(grid, x - 1, y);
			dfs(grid, x, y + 1);
			dfs(grid, x, y - 1);
			return;
		}
	}
}