/*Complete the function below
Node is as follows:
class Tree{
    int data;
    Tree left,right,random;
    Tree(int d){
        data=d;
        left=null;
        right=null;
        random=null;
    }
}*/
class Solution {
    public Tree cloneTree(Tree root) {
       
       Map<Tree, Tree> map = new HashMap<>();
       
      Tree temp = leftRightClone(root, map);
      
      return random(temp, root, map);
        
    }
    private Tree random(Tree temp, Tree root, Map<Tree, Tree> map){
        if(root == null)return null;
        
        if(root.random != null){
          
            temp.random = map.get(root.random);
        }
        
        temp.left = random(temp.left, root.left, map);
        temp.right = random(temp.right, root.right, map);
        return temp;
    }
    private Tree leftRightClone(Tree root, Map<Tree, Tree> map){
        if(root == null)return null;
        
           
         Tree temp = new Tree(root.data);
            
         map.put(root, temp);
         
       
        temp.left = leftRightClone(root.left, map);
        temp.right = leftRightClone(root.right, map);
        
        return temp;
    }
}
