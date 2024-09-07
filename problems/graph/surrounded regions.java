class Solution {
    public void solve(char[][] board) {
        int [][]v=new int[board.length][board[0].length];
        int col=board[0].length-1;
        int row=board.length-1;
        for(int i=0;i<= row;i++){
            if(board[i][0]=='O' && v[i][0]==0){
                dfs(board,v,i,0);
            }
            if(board[i][col]=='O' && v[i][col]==0){
                dfs(board,v,i,col);
            }
        }
        for(int i=0;i <= col;i++){
            if(board[0][i]== 'O' &&v[0][i]==0){
                dfs(board,v,0,i);
            }
            if(board[row][i] =='O' && v[row][i]==0){
                dfs(board,v,row,i);
            }
        }
        for(int i=0;i<=row;i++)
        for(int j=0;j<=col;j++)
        if(board[i][j]=='O' && v[i][j]==0)
         board[i][j]='X';
    }
    private void dfs(char[][]g,int[][]v,int row,int col){
        int r[]= {-1,0,+1,0};
        int c[]={0,+1,0,-1};
        v[row][col]=1;
        for(int i=0;i<4;i++){
            int cRow=row+r[i];
            int cCol=col+c[i];
            if(cRow < 0 || cRow >= g.length || cCol < 0 || cCol >= g[0].length)continue;
            if(v[cRow][cCol] == 0 && g[cRow][cCol]=='O'){
                v[cRow][cCol]=1;
                dfs(g,v,cRow,cCol);
            }
             
        }
    }
}
