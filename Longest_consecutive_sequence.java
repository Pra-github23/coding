class Solution {
    public int longestConsecutive(int[] nums) {
         if(nums==null || nums.length==0){
             return 0;
         }
        
        Set<Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longest=1;
        for(int num: set){
            
            if(!set.contains(num-1)){
                int curLongest=1;
                int curNum=num+1;
                while(set.contains(curNum)){
                    curLongest++;
                    curNum++;
                }
                longest=Math.max(longest,curLongest);
            }
        }
        return longest;
    }
}