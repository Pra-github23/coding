'''
class Solution:
    def searchKey(self, n, head, key):
        #Code here
        
        while head is not None:
            if head.data == key: return True
            head = head.next
        
        return False
