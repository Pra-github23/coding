class Solution {
    public int maximalSquare(char[][] matrix) {
        int []arr=new int[matrix[0].length];
        int sqrt=0;
       
        for(int i=0;i<matrix[0].length;i++)
        if(matrix[0][i]=='1'){
         arr[i]=1;
         sqrt=1;
        }

        for(int i=1;i<matrix.length;i++){
            int curPrev[]=new int[matrix[0].length];
            if(matrix[i][0]=='1'){
                sqrt=Math.max(sqrt,1);
                 curPrev[0]=1;
            }
        for(int j=1;j<matrix[0].length;j++){
            if(matrix[i][j]=='1'){
                curPrev[j]=Math.min(curPrev[j-1],Math.min(arr[j],arr[j-1]))+1;
                sqrt=Math.max(sqrt,curPrev[j]);
            }
        }
        arr=curPrev;
        }

      return sqrt*sqrt;
        
    }
}
