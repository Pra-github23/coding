class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        // if(prerequisites.length == 0)return new int[]{0};

        int count[] = new int[numCourses];
        List<List<Integer>> dir = new ArrayList<>();

        for(int i =0; i<numCourses; i++)
           dir.add(new ArrayList<>());

        for(int i = 0; i<prerequisites.length; i++){

            int node = prerequisites[i][1];
            int nextNode =prerequisites[i][0];
        
          dir.get(node).add(nextNode);
          count[nextNode]++;

        }

        Queue<Integer> q = new LinkedList<>();

        int res[] = new int[numCourses];
        int k =0;
        for(int i =0; i<numCourses; i++){
        if(count[i] == 0){
            res[k++] = i;
            q.offer(i);
        }

        }

        while(!q.isEmpty()){
            int curNode = q.poll();

            for(int nextNode : dir.get(curNode)){
                 count[nextNode]--;
                 if(count[nextNode] <= 0){
                    q.offer(nextNode);
                    res[k++] = nextNode;
                 }
            }
        }
        if(k != numCourses)return new int[]{};

        return res;

    }
}
