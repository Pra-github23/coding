/*Node class  used in the program
class Node
{
    int data;
    Node next;
    Node bottom;

    Node(int d)
    {
        data = d;
        next = null;
        bottom = null;
    }
}
*/
/*  Function which returns the  root of
    the flattened linked list. */
class GfG {
    Node flatten(Node root) {
        // Your code here
        if(root == null)return root;
        ArrayList<Integer> al=new ArrayList<>();
        Node temp=root;
        while(temp != null){
            
            Node btm=temp;
            while(btm != null){
                al.add(btm.data);
                btm=btm.bottom;
            }
            temp=temp.next;
        }
        Collections.sort(al);
        Node ll=new Node(al.get(0));
        Node t=ll;
        for(int i=1;i<al.size();i++){
           Node node= new Node(al.get(i));
           t.bottom=node;
           t=t.bottom;
        }
        return ll;
    }
}
