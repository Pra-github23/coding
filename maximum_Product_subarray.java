class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1)return nums[0];
        int sufPro=1;
        int prePro=1;
      //  int end=nums.length-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
         
          if(sufPro==0)sufPro=1;
          if(prePro==0)prePro=1;
           sufPro=sufPro*nums[nums.length-i-1];
          prePro=prePro*nums[i];
          max=Math.max(sufPro,Math.max(max,prePro));
        }
        return max;
    }
}