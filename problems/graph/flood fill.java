class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc] == color)return image;

        return flood(image, sr, sc, color);
    }
    private int[][] flood(int[][] image, int sr, int sc, int color){

        int startColor = image[sr][sc];

        image[sr][sc] = color;

        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(sr, sc));
        int row[] = {-1, 0, +1, 0};
        int col[] = {0, +1, 0, -1};

        while(!q.isEmpty()){
          Pair p = q.poll();
          int r = p.r;
          int c = p.c;

          for(int i = 0; i < 4; i++){

            if(row[i]+r < 0 || row[i]+r >= image.length || col[i]+c < 0 || col[i]+c >= image[0].length)continue;

            if(image[row[i]+r][col[i]+c] != startColor)continue;

            image[row[i]+r][col[i]+c] = color;
            q.offer(new Pair(row[i]+r, col[i]+c));
          }
        }
        return image;
    }
}
class Pair{
    int r;
    int c;
    Pair(int r, int c){
        this.r = r;
        this.c = c;
    }
}
