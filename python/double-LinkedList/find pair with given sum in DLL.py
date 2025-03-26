"""

Definition for singly Link List Node
class Node:
    def __init__(self,x):
        self.data=x
        self.next=None
        self.prev=None

You can also use the following for printing the link list.
displayList(node)
"""

class Solution:
    def findPairsWithGivenSum(self, target : int, head : Optional['Node']) -> List[List[int]]:
        # code here
        if head.next == None: 
            return []
        res = []
        temp = head
        dic = {}
        t = temp
       
        while t:
           
            dic[t.data] = t.data
            t = t.next
      
        
        while temp:
            
           if dic.get(target - temp.data, -1) != -1 and target != 2 * temp.data:
               res.append([temp.data, target - temp.data])
               del dic[target - temp.data]
               if dic.get(temp.data, -1) != -1:
                    del dic[temp.data]
        
           temp = temp.next
         
        return res
