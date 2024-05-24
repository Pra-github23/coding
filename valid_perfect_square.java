class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;
        long low=0;
        long high=num/2;
        while(low <= high){
            long mid=(low+high)/2;
            if(mid*mid == num)return true;
            if( mid*mid > num)high =mid-1;
            else low=mid+1;
        }
        return false;
    }
}