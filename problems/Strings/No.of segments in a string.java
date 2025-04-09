class Solution {
    public int countSegments(String s) {
        if(s.length() == 0 || (s.length() == 1 && s.charAt(0) == ' '))return 0;
        
        
        int count = 0;
        
        int i = 0;
        
        while(i < s.length()){
            if(s.charAt(i) != ' '){
                count++;
                while(i < s.length() && s.charAt(i) != ' ')i++;
            }
            else{
                while(i < s.length() && s.charAt(i) == ' ')i++;
            }
        }
        return count;
        
    }
}
