class Solution {
    public void solve(char[][] board) {

       Queue<Pair> q = new LinkedList<>();
       int[][] v = new int[board.length][board[0].length];

       int cc = board[0].length-1;
        int rr = board.length-1;
       for(int i = 0 ;i <= rr; i++){
          if(board[i][0] == 'O'){
            q.offer(new Pair(i,0));
            v[i][0] = 1;
          }
          
          if(board[i][cc] == 'O'){
            q.offer(new Pair(i, cc));
            v[i][cc] = 1;
          }
       } 

       for(int i =0; i <= cc ; i++){

        if(board[0][i] == 'O'){
            v[0][i] = 1;
            q.offer(new Pair(0, i));
        }
        if(board[rr][i] == 'O'){
            v[rr][i] = 1;
            q.offer(new Pair(rr, i));
        }
       }
    

       

       int row[] = {-1, 0, +1, 0};
       int col[] = {0, +1, 0, -1};

       while(!q.isEmpty()){
         Pair p = q.poll();

         int r = p.r;
         int c = p.c;

         for(int i =0; i<4; i++){

            if(row[i]+r < 0 || row[i]+r >= board.length || col[i]+c < 0 || col[i]+c >= board[0].length)continue;

            if(board[row[i]+r][col[i]+c] == 'X' ||  v[row[i]+r][col[i]+c] == 1)continue;


            v[row[i]+r][col[i]+c] = 1;
            q.offer(new Pair(row[i]+r, col[i]+c));
         }
       }

       for(int i =0; i<= rr; i++)
       for(int j =0; j<= cc; j++)
       if(board[i][j] == 'O' && v[i][j] == 0)board[i][j] = 'X';
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
