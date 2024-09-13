class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int []indegree=new int[V];
        for(ArrayList<Integer> edge : adj){
            for(int index:edge){
              
            indegree[index]++;
            }
           
            
        }
         
        Stack<Integer> stack=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++)
        if(indegree[i]==0){
            //System.out.println(i);
            stack.push(i); //indegree
            q.offer(i);
        }
        
        while(!q.isEmpty()){
            int node=q.poll();
            for(int index : adj.get(node)){
                indegree[index]--;
                if(indegree[index]==0){
                 stack.push(index);
                 q.offer(index);
                }
            }
        }
        
        int []res=new int[stack.size()];
        int k=res.length-1;
        while(!stack.isEmpty()){
            res[k--]=stack.pop();
           
        }
        
         return res;
    }
}
