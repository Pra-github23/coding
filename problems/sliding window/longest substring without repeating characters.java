class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        Map<Character,Integer> map = new HashMap<>();
        int j=0;
        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           while(map.containsKey(ch) && j < i){
            char begin = s.charAt(j++);
            map.put(begin, map.getOrDefault(begin,0)-1);
            if(map.get(begin) == 0) map.remove(begin);

           }
           map.put(ch,1);

           max = Math.max(max, i-j+1);
        }
        return max;
    }
}
