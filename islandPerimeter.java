class Solution {
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



//standard solution
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int islands = 0, neighbours = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++; // count islands
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++; // count down neighbours
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++; // count right neighbours
                }
            }
        }

        return islands * 4 - neighbours * 2;
    }
}