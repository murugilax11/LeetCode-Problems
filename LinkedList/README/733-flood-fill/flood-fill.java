class Solution {
    void flood(int[][] image, int sr, int sc, int color,int curColor){
        if(sr <0 || sc < 0|| sr >= image.length || sc >= image[0].length || image[sr][sc] != curColor){
            return;
        }
        image[sr][sc] = color;
        flood(image,sr+1,sc,color,curColor);
        flood(image,sr-1,sc,color,curColor);
        flood(image,sr,sc+1,color,curColor);
        flood(image,sr,sc-1,color,curColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int curColor = image[sr][sc];
                if(curColor== color) return image;
                flood(image,sr,sc,color,curColor);
        return image;
    }
}