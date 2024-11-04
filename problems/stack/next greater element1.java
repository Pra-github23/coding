class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){

            if(!st.isEmpty() && st.peek() > nums2[i]){
                map.put(nums2[i],st.peek());
            }else{
               
                int temp=-1;
                 
                while(!st.isEmpty() && st.peek() < nums2[i]){
                     st.pop();
                    if(!st.isEmpty() && st.peek() > nums2[i]){
                        temp=st.peek();
                        break;
                    }
                }
                 map.put(nums2[i],temp);
            }
            st.push(nums2[i]);
        }
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
         arr[i]=map.get(nums1[i]);

         return arr;
    }
}
