class Solution {
    public int trap(int[] height) {
        int water=0;
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
         int leftPointer=0;
         int rightPointer=height.length-1;

        while(leftPointer <= rightPointer){
            if(leftMax <= rightMax){
                 
                 leftMax=Math.max(height[leftPointer],leftMax); 
                 water+=leftMax-height[leftPointer];
                 leftPointer++;
            }
            else{
                rightMax=Math.max(height[rightPointer],rightMax);
                water+=rightMax-height[rightPointer];
                rightPointer--;
            }
        }
        return water;
    }
}
