class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        
        upperLayer = "qwertyuiop"
        middleLayer = "asdfghjkl"
        
        
        res  = []
        
        for string in words:
            
            temp = string.lower()
            length = len(temp)
            count  = 0
            
            for i in range(length):
                
                ch = temp[i]
                
                if ch in upperLayer: count += 1
                elif ch in middleLayer : count += 2
                else: count += 3
            
            ch = temp[0]
            if ch in upperLayer:
                if count == length: res.append(string)
            elif ch in middleLayer:
                if count == length*2: res.append(string)
            else:
                if count == length*3: res.append(string)
       
        return res
                
                
        
