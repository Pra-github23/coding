class Solution:
    def romanToInt(self, s: str) -> int:

        total = 0
        i = 0
        while i < len(s):

            ch = s[i]

            if ch == 'M':
                total += 1000
            elif ch == 'C':
                if i+1 < len(s) and s[i+1] == 'D':
                    total += 400
                    i += 1
                elif i+1 < len(s) and s[i+1] == 'M':
                    total += 900
                    i += 1
                else: total += 100
            elif ch == 'D':
                total += 500
            elif ch == 'X':
                if i+1 < len(s) and s[i+1] == 'C':
                    total += 90
                    i += 1
                elif i+1 < len(s) and s[i+1] == 'L':
                    total += 40
                    i += 1
                else: total += 10
            elif ch == 'L':
                total += 50
            elif ch == 'I':
                if i+1 < len(s) and s[i+1] == 'V':
                    total += 4
                    i += 1
                elif i+1 < len(s) and s[i+1] == 'X':
                    total += 9
                    i += 1
                else : total += 1
            elif ch == 'V':
                total += 5
            
            i += 1
            
        return total

                

        
