/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Map<Integer,Integer> map =new HashMap<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Node temp=head;
        while(temp != null){
            map.put(temp.data,map.getOrDefault(temp.data,0)+1);
            temp=temp.next;
        }
        while(head != null){
            if(map.containsKey(target-head.data)){
                 int size1=map.get(target-head.data);
                 int size2=map.get(head.data);
                 if(head.data==(target-head.data) && size1 == 1 && size2 == 1){
                     //nothing
                 }
                 else{
                     long count=size1*size2;
                     while(count-- > 0){
                         ArrayList<Integer> al=new ArrayList<>();
                         al.add(head.data);
                         al.add(target-head.data);
                         res.add(al);
                     }
                    
                 }
                 map.remove(head.data);
                 if(map.containsKey(target-head.data))map.remove(target-head.data);
                 
            }
           
            head=head.next;
        }
        return res;
    }
}
