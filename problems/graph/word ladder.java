class Pair{
    String begin;
    int count;
    Pair(String begin,int count){
        this.begin=begin;
        this.count=count;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(beginWord,1));
       
        Set<String > set=new HashSet();
         set.addAll(wordList);

        while(!q.isEmpty()){
           Pair p=q.poll();
           String begin=p.begin;
           int prevCount=p.count;

            if(endWord.equals(begin)) return prevCount;
            
             for(int j=0;j<begin.length();j++){
                char [] chArray=begin.toCharArray();
                for( char c='a' ; c<='z' ; c++){
                   
                    chArray[j]=c;
                    String compareString= new String(chArray);
                    if(set.contains(compareString)){
                        
                        set.remove(compareString);
                        q.offer(new Pair(compareString,prevCount+1));
                    }
                
             }
           }
        }
        return 0;
    }
}
