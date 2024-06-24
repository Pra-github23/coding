class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        if(arr.length==0)return null;
          Node node=new Node(arr[0]);
          Node t=node;
        for(int i=1;i<arr.length;i++){
         Node n=new Node(arr[i]);
         t.next=n;
         n.prev=t;
         t=t.next;
        }
        return node;
    }
}
