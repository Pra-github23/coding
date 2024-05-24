class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int size=matrix.length*matrix[0].length;
        int ele[]=new int[size];
        int index=0;
        for(int row=0;row<matrix.length;row++)
        for(int col=0;col<matrix[0].length;col++)
        ele[index++]=matrix[row][col];
       

        return binarySearch(ele,0,size-1,target);
    }
    private boolean binarySearch(int ele[],int low,int high,int t){
        while(low <= high){
            int mid=(low+high)/2;
            if(t==ele[mid])return true;
            if(ele[mid] > t)high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}