class Solution {
    public String minWindow(String s, String t) {
        
    Map<Character,Integer> map = new HashMap<>();
    for(int i =0; i< t.length();i++)
      map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);

    Map<Character,Integer> map2 = new HashMap<>();

    String str = "";
    int j =0;

    for(int i =0; i< s.length(); i++){
        map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i), 0)+1);
       
        
        
       boolean isValid = map.entrySet().stream()
            .allMatch(e -> map2.containsKey(e.getKey()) && map2.get(e.getKey()) >= e.getValue());


        while(j <= i && isValid){
             
             System.out.println(i+"  "+j);
             if(str.equals("") || str.length() > i - j + 1)
                str = s.substring(j,i+1);
            
            char ch = s.charAt(j);
            map2.put(ch, map2.getOrDefault(ch,0)-1);

            if(map2.get(ch) == 0)map2.remove(ch);
            j++;
            isValid = map.entrySet().stream()
                      .allMatch(e -> map2.containsKey(e.getKey()) && map2.get(e.getKey()) >= e.getValue());
        }
       
    }   
    return str;

    }
}
