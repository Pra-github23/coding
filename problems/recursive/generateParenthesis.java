class Solution {
    private List<String> l=new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        
        parenthesis(0,0,n,"");
        return l;
    }
    private void parenthesis(int o,int c, int size,String str){
       
        if(o==size && o==c){
         if(!l.contains(str))
            l.add(str);
          return;
        }
         if(((o+c)/2 + (o+c)%2) > size  || o < c)return;
      
          parenthesis(o+1,c,size,str+"(");
         
         
          parenthesis(o,c+1,size,str+")");
        
        return;
    }
}
