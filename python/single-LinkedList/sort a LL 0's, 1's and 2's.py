'''
	Your task is to segregate the list of 
	0s,1s and 2s.
	
	Function Arguments: head of the original list.
	Return Type: head of the new list formed.

	{
		# Node Class
		class Node:
		    def __init__(self, data):   # data -> value stored in node
		        self.data = data
		        self.next = None
	}

'''
class Solution:
    #Function to sort a linked list of 0s, 1s and 2s.
    def segregate(self, head):
        #code here
        
        stack0 = []
        stack1 = []
        stack2 = []
    
        temp  = head
        
        while temp is not None:
            t = temp.next
            temp.next = None
            
            if temp.data == 0:
                stack0.append(temp)
            elif temp.data == 1:
                stack1.append(temp)
            else:
                stack2.append(temp)
            temp = t
            
       
        
        res = Node(-1)
        dummy = res
        while stack0 or stack1 or stack2:
            if stack0:
                dummy.next = stack0.pop()
            elif stack1:
                dummy.next = stack1.pop()
            else:
                dummy.next = stack2.pop()
            
            dummy = dummy.next
        
        return res.next
