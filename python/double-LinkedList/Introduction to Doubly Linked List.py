
'''
# Node Class
	class Node:
	    def __init__(self, data):   # data -> value stored in node
	        self.data = data
	        self.next = None
	        self.prev = None
'''
class Solution:
    def constructDLL(self, arr):
        # Code here
        head = Node(arr[0])
        temp = head
        
        for i in range(1, len(arr)):
            t = Node(arr[i])
            temp.next = t
            t.prev = temp
            temp = t
        
        return head
