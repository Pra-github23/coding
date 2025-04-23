class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        
        ind = 0
        
        while ind < len(flowerbed):
            
            if flowerbed[ind] == 0:
                
                if len(flowerbed) > ind + 1 and flowerbed[ind+1] == 0:
                    n -= 1
                    ind += 2
                elif len(flowerbed) <= ind + 1:
                    n -= 1
                    ind += 2
                else :
                    ind += 1
            else:
                ind += 2
        
        return n <= 0
                
                    
            
        
