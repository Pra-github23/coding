class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,target,0,nums.length-1);
    }
    private int bs(int[] arr,int t,int low,int high){
        if(low > high)return -1;
        int mid=(low+high)/2;
        if(arr[mid]==t)return mid;
        if(arr[mid] > t)return bs(arr,t,low,mid-1);
        return bs(arr,t,mid+1,high);
    }
}