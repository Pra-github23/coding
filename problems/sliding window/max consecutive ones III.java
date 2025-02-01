class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
       
       int j =0;
       int []arr = new int[2];
        for(int i =0;i<nums.length; i++){
         
           arr[nums[i]]++;
           while(arr[0] > k){
               arr[nums[j]]--;
               j++;
           }

          max = Math.max(max, i-j+1);
          
        }
        return max;
    }
}
