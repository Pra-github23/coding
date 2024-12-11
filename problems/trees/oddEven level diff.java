/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution
{
	int getLevelDiff(Node root)
	{
	    Queue<Node> q = new LinkedList<>();
	    int oddSum = 0;
	    int evenSum = 0;
	    int level = 0;
	    
	    q.offer(root);
	    
	    while(!q.isEmpty()){
	        int size = q.size();
	        int sum = 0;
	        while(size-- > 0){
	            Node n = q.poll();
	            sum += n.data;
	            
	            if(n.left  != null)q.offer(n.left);
	            if(n.right != null)q.offer(n.right);
	            
	            
	        }
	        if(level % 2 == 0)evenSum += sum;
	        else oddSum += sum;
	        
	        level++;
	    }
	     return evenSum - oddSum;
	}
}
