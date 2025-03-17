
'''
# Node Class
	class Node:
	    def __init__(self, data):   # data -> value stored in node
	        self.data = data
	        self.next = None
'''
class Solution:
    def constructLL(self, arr):
        # code here
        if len(arr) == 0: return None
        head = Node(arr[0])
        temp = head
        
        for i in range(1, len(arr)):
            temp.next = Node(arr[i])
            temp = temp.next
        
        return head
