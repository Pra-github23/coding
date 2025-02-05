 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)return new ArrayList<>();

        List<List<Integer>> l = new ArrayList<>();

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        boolean bool = true;

        while(!st.isEmpty()){
            int size = st.size();
           List<Integer> a = new ArrayList<>();
           Stack<TreeNode> d = new Stack<>();
            for(int i =0;i<size;i++){

             
              TreeNode cur = st.pop();
               
              a.add(cur.val);

              if(bool){
                
                if(cur.left != null)
                   d.push(cur.left);
                if(cur.right != null)
                   d.push(cur.right);
              }
              else{

                if(cur.right != null)
                  d.push(cur.right);
                if(cur.left != null)
                  d.push(cur.left);
              }
            }

            st = d;
            l.add(a);

            bool = bool ? false : true;

        }

        return l;
        
    }
}
             
