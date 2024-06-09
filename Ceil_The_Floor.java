public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int low=0;
      int high=n-1;
      while(low <= high){
        int mid=(low+high)/2;
        if(a[mid]==x){
          return new int[]{x,x};
        }
        if(a[mid] < x)low=mid+1;
        else high=mid-1;
      }
      if(low==n) return new int[]{a[high],-1};
      
      if(high < 0)return new int[]{-1,a[low]};
      return new int[]{a[high],a[low]};
    }
    
}