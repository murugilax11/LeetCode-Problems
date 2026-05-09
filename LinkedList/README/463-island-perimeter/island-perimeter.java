class Solution {
    int backtrack(int[][] grid, int row, int col){
        if(row<0 || col<0 || row>=grid.length || col>= grid[0].length || grid[row][col] == 0){
            return 1;
        }
        if(grid[row][col] == -1){
            return 0;
        }
        grid[row][col] = -1;
        return backtrack(grid,row+1,col) + backtrack(grid,row,col+1) + 
        backtrack(grid,row-1,col) + backtrack(grid,row,col-1);
            
    }
    public int islandPerimeter(int[][] grid) {
        int perimeter =0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0; i<row;i++){
            for(int j =0; j<col;j++){
                if(grid[i][j] == 1){
                    perimeter += backtrack(grid,i,j);
                }
            }
        }
        return perimeter;
    }
}