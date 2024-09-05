class Solution {
    public int maxDistToClosest(int[] seats) {
        int first=-1;
        int end=-1;
        int max=0;
        int flag=0;
        for(int i=0;i<seats.length;i++){
            if(first == -1 && seats[i]==1){
                max=i;
               first=i;
            }
            else if(end == -1 && seats[i]==1){
              max=Math.max(max,(i-first)/2);
              first=i;
              flag=1;
            }
        }
        if(flag==0)return Math.max(first,seats.length-first-1);
        max=Math.max(max,seats.length-first-1);
        return max;

    }
}
