class Solution:
    def removeOuterParentheses(self, s: str) -> str:

        stack = [0]
        openSysbol = []
        i = 1
        while i < len(s):
            ch = s[i]
            if ch == ')':
                if openSysbol is not None:
                    openSysbol.pop()
                else:
                    stack.add(i)
                    if i+1 < len(s):
                        i += 1
                        stack.add(i)
            
            else: openSysbol.append(i)
            i += 1
        
        stri = str("")

        for i in range(len(s)):
            if i not in stack:
                stri += s[i]

        return stri        
