'''
# Node Class
		class Node:
		    def __init__(self, data):   # data -> value stored in node
		        self.data = data
		        self.next = None
		        self.prev = None
'''
class Solution:
    #Function to remove duplicates from unsorted linked list.
    def removeDuplicates(self, head):
        # code here
        # return head after editing list
        temp  = head
        
        while temp :
            
           
            if temp.next == None or temp.data != temp.next.data:
                
                temp = temp.next
            else:
                
                temp.next = temp.next.next
               
        
        return head
