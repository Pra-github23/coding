class Solution:
    def constructRectangle(self, area: int) -> List[int]:
        
        l = area
             
        diff = area - 1
        
        rL = area
        rW = 1
        
        while 1 <= l :
            
            w = area // l
            
            if l*w == area and abs(l - w) < diff:
                rL = l
                rW = w
                diff = l - w
            
            l -= 1
            
        
        return [rL,rW]
              
