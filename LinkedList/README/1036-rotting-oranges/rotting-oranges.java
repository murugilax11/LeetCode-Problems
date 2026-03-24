class Solution {
    public int orangesRotting(int[][] grid) {
       int row = grid.length;
       int col = grid[0].length;
       Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

         for(int i =0; i<row;i++){
            for(int j =0; j <col; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
         }

         int min =0;
         int[][] dir = {{1, 0}, {-1,0}, {0,1}, {0,-1}};
         while (!q.isEmpty() && fresh > 0) {
         int size = q.size();
         for(int i =0;i<size;i++){
            int[] cur = q.poll();
            for(int[] d : dir){
                int x = cur[0] + d[0];
                int y = cur[1] + d[1];
                if (x >= 0 && y >= 0 && x < row && y < col && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        q.add(new int[]{x, y});
                        fresh--;
                    }
            }
         }
         min++;
         }
         return fresh == 0 ? min : -1;
    }
}