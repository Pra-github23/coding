class Solution {
    public int trap(int[] height) {
        
        if(height.length<=2){
            return 0;
        }
      
       int store=0;
      
       int f=0;
       int e=height.length-1;
       int lMax=0;
       int rMax=0;
       while(f <= e){
        if(rMax >= lMax) {
            lMax=Math.max(lMax,height[f]);
            store+=lMax-height[f];
            f++;
        }
        else{
            rMax=Math.max(rMax,height[e]);
            store+=rMax-height[e];
            e--;
        }
       }
      return store;
    }
}