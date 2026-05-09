class Solution {
     long backtrack(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length ||
            grid[row][col] == 0) {

            return 0;
        }

        long sum = grid[row][col];

        grid[row][col] = 0;
        sum += backtrack(grid, row + 1, col);
        sum += backtrack(grid, row - 1, col);
        sum += backtrack(grid, row, col + 1);
        sum += backtrack(grid, row, col - 1);

        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > 0) {

                    long islandSum = backtrack(grid, i, j);

                    if (islandSum % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}