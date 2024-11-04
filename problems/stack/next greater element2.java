class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int arr[]=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        int len=nums.length;
        for(int i=len*2-1;i>=0;i--){
            if(!st.isEmpty() && st.peek() > nums[i%len])
              arr[i%len]=st.peek();
            else{
               
                while(!st.isEmpty() && st.peek() <= nums[i%len]){
                    st.pop();
                   
                }

                if(!st.isEmpty())
                 arr[i%len]=st.peek();
                else arr[i%len]=-1;
            }
            st.push(nums[i%len]);

        }

        return arr;
    }
}
