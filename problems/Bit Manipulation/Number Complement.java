class Solution {
    public int findComplement(int num) {
        int base = 1;
        int res = 0;
        
        while (num > 0){
            
            if(num % 2 == 0) res += base;
            base *= 2;
            num /= 2;
        }
        
        return res;
            
    }
}
