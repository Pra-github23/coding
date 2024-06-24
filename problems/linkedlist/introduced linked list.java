/*
class Node { 
    int data; 
    Node next; 

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
} 
*/
class Solution {
    static Node constructLL(int arr[]) {
       Node node=new Node();
       Node t=node;
       for(int i=0;i<arr.length;i++){
           t.next=new Node(arr[i]);
           t=t.next;
       }
       return node.next;
    }
}
