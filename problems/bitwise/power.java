class Solution {
    public double myPow(double x, int n) {
        //  return Math.pow(x,n);
        return power(x,n);
    }
    private double power(double base ,int p){
        double x=base;
        double res=1;
       
        long pow=p;
        if(pow < 0)pow=-1*pow;
        while(pow  > 0){
            if((pow&1)== 1){
                res=res*base;
                pow-=1;
            }else{
               base*=base;
            
            pow >>=1;
            }
            
        }
        if(p < 0)res=1.0/res;
        return res;
    }
}
