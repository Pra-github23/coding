
'''
class DLLNode:
    def __init__(self, val):
        self.data = val
        self.next = None
        self.prev = None
'''

class Solution:
    def reverseDLL(self, head):
        #return head of reverse doubly linked list
        prev = None
        temp = head
        while temp is not None:
            t = temp.next
            
            temp.next = prev
            temp.prev = None
            if prev is not None:
                prev.prev = temp
                
            prev = temp
            temp = t
        
        return prev
