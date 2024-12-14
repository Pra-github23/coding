/*Structure of the Node of the BST is as
class Node
{
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}
*/

class Solution
{
	public static int countPairs(Node root1, Node root2, int x)
	{
		Map<Integer, Integer> map =new HashMap<>();
		
		Queue<Node> q = new LinkedList<>();
		
		q.offer(root1);
		while(!q.isEmpty()){
		    int size = q.size();
		    while(size-- > 0){
		        Node temp = q.poll();
		        
		        int diff = x - temp.data;
		        
		        map.put(diff, map.getOrDefault(diff, 0)+1);
		        if(temp.left != null)q.offer(temp.left);
		        if(temp.right != null)q.offer(temp.right);
		    }
		}
		
		int count = 0;
		
		q.offer(root2);
		
		while(!q.isEmpty()){
		    int size = q.size();
		    while(size-- > 0){
		        Node t = q.poll();
		        if(map.containsKey(t.data))count += map.get(t.data);
		        
		        if(t.left != null)q.offer(t.left);
		        if(t.right != null)q.offer(t.right);
		    }
		}
		
		return count;
// 		storeB(root1, map, x);
		
// 		return equals(root2, map);
	}
	private static int equals(Node root, Map<Integer, Integer> map){
	    if(root == null)return 0;
	    
	    int count = 0;
	    if(map.containsKey(root.data)) count = map.get(root.data);
	    
	    return count + equals(root.left, map) + equals(root.right, map);
	}
	private static void storeB(Node root, Map<Integer, Integer> map, int x){
	    if(root == null)return ;
	    
	    int diff = x - root.data;
	    
	    map.put(diff, map.getOrDefault(diff, 0)+1);
	    
	    storeB(root.left, map, x);
	    storeB(root.right, map, x);
	}
}
