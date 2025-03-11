class Solution:
    def frequencySort(self, s: str) -> str:

       dic = {}

       for ch in  s:
        dic[ch] = dic.get(ch,0)+1
       
       l = []
       for k,v in dic.items():
        l.append([v,k])
       
       l.sort(key =lambda x:x[0], reverse=True)

       res = []
       for v, ch in l:
        res.append(ch*v)
       
       return "".join(res)

       
        
