class Pair{
    int nRow;
    int nCol;
    int pRow;
    int pCol;
    Pair(int nRow,int nCol,int pRow ,int pCol){
       this.nRow=nRow;
       this.nCol=nCol;
       this.pRow=pRow;
       this.pCol=pCol;
    }
}
class Solution {

    public boolean containsCycle(char[][] grid) {
        int [][]v=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(v[i][j]==0){
                    char ch=grid[i][j];
                    if(cycle(v,grid,ch,i,j))return true;
                }
            }
        }
        return false;
    }
    private boolean cycle(int[][]v, char[][] g,char ch,int r,int c){
       Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(r,c,-1,-1));
        int[]row={-1,0,+1,0};
        int[]col={0,+1,0,-1};
        while(!q.isEmpty()){
            Pair p=q.poll();
            int nRow=p.nRow;
            int nCol=p.nCol;
            int pRow=p.pRow;
            int pCol=p.pCol;
            v[nRow][nCol]=1;
    // System.out.println(nRow +"  "+ nCol);
            for(int i=0;i<4;i++){
                if(nRow+row[i]==pRow && nCol+col[i]==pCol)continue;
                if(nRow+row[i] < 0 || nRow+row[i] >= g.length || nCol+col[i] < 0 || nCol+col[i] >= g[0].length)continue;
                if(v[nRow+row[i]][nCol+col[i]]==1 && ch==g[nRow+row[i]][nCol+col[i]]) {
                    //System.out.println("y u r true  row "+(nRow+row[i])+" col "+(nCol+col[i])+" nR"+nRow+" nC"+nCol);
                    return true;
                }
                if(v[nRow+row[i]][nCol+col[i]]==0 && g[nRow+row[i]][nCol+col[i]]==ch)
                       q.offer(new Pair(nRow+row[i],nCol+col[i],nRow,nCol));
            }
        }
        return false;
    }
}
