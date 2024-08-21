class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int prev=nums[i];
            int c=1;
            for(int j=i+1;j<nums.length;j++){
                  
                if(prev < nums[j])c++;
                else break;
                prev=nums[j];
            }
            if(c==nums.length)return c;
            max=Math.max(max,c);
        }
        return max;
    }
}
