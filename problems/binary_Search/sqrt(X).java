class Solution {
    public int mySqrt(int x) {
        if(x==1)return x;
        int low=1;
        int high=x/2;
        while(low <= high){
            long mid=(high+low)/2;
           // System.out.println(mid+" "+low+" "+high);
            if(mid*mid==x)return (int)mid;
            if(mid*mid < x)low=(int)mid+1;
            else high =(int)mid-1;
        }
        return high;
    }
}
