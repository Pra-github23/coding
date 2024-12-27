class Solution {
    public int[][] updateMatrix(int[][] mat) {
        

        return updateBfs(mat);
    }
    private int[][] updateBfs(int[][] mat){
        
        
        int v[][] = new int[mat.length][mat[0].length];
        Queue<Pair> q = new LinkedList<>();
        int count =0;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    count++;
                    q.offer(new Pair(i, j, 0));
                }
            }
        }
        if(count == mat.length * mat[0].length -1)return mat;

        int row[] = {-1, 0, +1, 0};
        int col[] = {0, +1, 0, -1};

        while(!q.isEmpty()){
            Pair p = q.poll();
            int r = p.r;
            int c = p.c;
            int dist = p.dist;

             for(int i = 0; i < 4; i++){

                if(row[i]+r < 0 || row[i]+r >= mat.length || col[i]+c < 0 || col[i]+c >= mat[0].length)continue; 

                if(mat[row[i]+r][col[i]+c] == 0 || v[row[i]+r][col[i]+c] == 1)continue;
                
                v[row[i]+r][col[i]+c] = 1;
                mat[row[i]+r][col[i]+c] = dist + 1;

                q.offer(new Pair(row[i]+r, col[i]+c, dist+1));
             }
        }

        return mat;
    }
}
class Pair{
    int r;
    int c;
    int dist;

    Pair(int r, int c, int dist){
        this.r = r; 
        this.c = c;
        this.dist = dist;
    }
}
