class Solution {
    boolean backtrack(int[][] grid1, int[][] grid2, int row, int col){
        if(row<0 || col<0 || row>=grid2.length || col>=grid2[0].length || grid2[row][col] == 0){
            return true;
        }
        grid2[row][col] = 0;
        boolean valid = (grid1[row][col] == 1);

        boolean down = backtrack(grid1, grid2, row+1, col);
        boolean right = backtrack(grid1, grid2, row, col+1);
        boolean up = backtrack(grid1, grid2, row-1, col);
        boolean left = backtrack(grid1, grid2, row, col-1);

        return valid && down && right && up && left;
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count  =0;
        int row = grid2.length;
        int col = grid2[0].length;
        for(int i =0; i<row; i++){
            for(int j =0; j<col;j++){
                if(grid2[i][j] == 1){
                    if(backtrack(grid1, grid2, i,j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}