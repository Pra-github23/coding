class Solution:
    def delete_node(self, head, x):
        #code here
        if x == 1:
            temp = head.next
            head.next = None
            temp.prev = None
            return temp
        temp = head
        while x > 2:
            x -= 1
            temp = temp.next
        
        if temp is None or temp.next is None : return head
        
        t = temp.next.next
        if t is None :
            temp.next = None
            return head
            
        temp.next = t
        t.prev = temp
        
        return head
