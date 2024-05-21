class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> l=new ArrayList<>();
       sub(nums,l,new ArrayList<Integer>(),0);
       return l;
    }
    private void sub(int[] arr,List<List<Integer>> l,List<Integer> sum,int index){
        if(index==arr.length){
            l.add(new ArrayList<>(sum));
            return ;
        }
        sum.add(arr[index]);
         sub(arr,l,sum,index+1);
         sum.remove(sum.size()-1);
         sub(arr,l,sum,index+1);
         return ;
         
    }
}