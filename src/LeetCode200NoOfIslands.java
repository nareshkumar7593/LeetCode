import java.util.Arrays;

public class LeetCode200NoOfIslands {

    void dfs(char[][] grid, int r, int c) {
      int nr = grid.length;
      int nc = grid[0].length;

      if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
        return;
      }

      grid[r][c] = '0';
      dfs(grid, r - 1, c);
      dfs(grid, r + 1, c);
      dfs(grid, r, c - 1);
      dfs(grid, r, c + 1);
    }

    public int numIslands(char[][] grid) {
      if (grid == null || grid.length == 0) {
        return 0;
      }

      int nr = grid.length;
      int nc = grid[0].length;
      int num_islands = 0;
      for (int r = 0; r < nr; ++r) {
        for (int c = 0; c < nc; ++c) {
          if (grid[r][c] == '1') {
            ++num_islands;
            dfs(grid, r, c);
          }
        }
      }

      return num_islands;
    }

  public static void main(String[] args) {
    LeetCode200NoOfIslands lc = new LeetCode200NoOfIslands();

    char[][] input = {{'1','1','1','1','1'},{'1','1','0','1','0'},{'1','1','0','1','0'},{'0','0','0','0','0'}};
    int value = lc.numIslands(input);
    System.out.println(value);
  }

}
