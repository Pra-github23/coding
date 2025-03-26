'''
# Node Class
	class Node:
	    def __init__(self, data):   # data -> value stored in node
	        self.data = data
	        self.next = None
	        self.prev = None
'''
class Solution:
    #Function to delete all the occurances of a key from the linked list.
    def deleteAllOccurOfX(self, head, x):
        # code here
        # edit the linked list
        
        results = Node(-1)
        dummy = results
        
        while head:
            temp = head.next
            head.next = None
            if head.data != x:
                dummy.next = head
                head.prev = dummy
                dummy = dummy.next
            head = temp
        
        return results.next
