class Solution {
    public boolean isIsomorphic(String s, String t) {
      //  Map <Character,Integer>map=new HashMap<>();
      int map1[]=new int[200];
      int map2[]=new int[200];
        for(int i=0;i<s.length();i++){
       
             System.out.println(map1[s.charAt(i)]+"->"+s.charAt(i)+"  "+map2[t.charAt(i)]+"->"+t.charAt(i));
          if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                return false;

         map1[s.charAt(i)]=1+i;
         map2[t.charAt(i)]=1+i;
            System.out.println((map1[s.charAt(i)]=1+i));
            System.out.println((map2[t.charAt(i)]=1+i));
        }

      return true;
    }
}