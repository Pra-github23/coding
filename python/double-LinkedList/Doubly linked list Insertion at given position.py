'''
class Node:
	def __init__(self, data):
		self.data = data
		self.next = None
		self.prev = None

'''

class Solution:
    #Function to insert a new node at given position in doubly linked list.
    def addNode(self, head, p, x):
        # Code here
        
        temp = head
        while p > 0:
            p -= 1
            temp = temp.next
        
        newNode = Node(x)
        rem = temp.next
        temp.next = newNode
        newNode.prev = temp
        newNode.next = rem
        
        return head
