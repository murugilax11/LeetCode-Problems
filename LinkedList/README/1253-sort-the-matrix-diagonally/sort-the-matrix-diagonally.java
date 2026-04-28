class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer, List<Integer>> map =new HashMap<>();
        int row = mat.length;
        int col = mat[0].length;
        for(int i =0;i<row;i++){
            for(int j =0; j <col; j++){
                int key = i-j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }

        for(List<Integer> list : map.values()){
            Collections.sort(list);
        }
             
        for(int i =0;i<row;i++){
            for(int j =0; j <col; j++){
                int key = i-j;
                mat[i][j] = map.get(key).remove(0);
            }
        }
        return mat;
    }
}