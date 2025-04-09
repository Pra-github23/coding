class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        
        int maxDist = Integer.MIN_VALUE;
    
        Arrays.sort(heaters);
        
        for(int i =0; i< houses.length; i++){
         int ind = binarySearch(heaters , houses[i]);
         int d1 = ind - 1 >= 0 ? Math.abs(heaters[ind-1] - houses[i]) : Integer.MAX_VALUE;
         int d2 = ind < heaters.length ? Math.abs(heaters[ind] - houses[i]) : Integer.MAX_VALUE;
         maxDist = Math.max(maxDist, Math.min(d1, d2));   
        }
      
        return maxDist;
        
    }
    private int binarySearch(int[] h, int p){

        int low = 0;
        int high = h.length-1;

        while(low <= high){
           int m = (high+low)/2;

           if(h[m] == p)return m;
           if(h[m] < p)low = m +1;
           else high = m-1;
        }
        return low;
    }
}
