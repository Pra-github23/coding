class Solution:
    def maxDepth(self, s: str) -> int:

        count = 0
        for ch  in s:
            if ch == '(':
                if count > 0:
                    count -= 1
            elif ch == ')':
                count += 1
        
        return count
        
