class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i =0; i< numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : prerequisites){
            adj.get(edge[1]).add(edge[0]);
        }
        
        int[] indegree = new int[numCourses];
        for(int i=0; i< numCourses;i++){
            for(int n : adj.get(i)){
                indegree[n]++;
            }
        }       
        
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        int count =0;
        while(!q.isEmpty()){
            int vertex = q.poll();
            count++;
            for(int m : adj.get(vertex)){
                indegree[m]--;
                if(indegree[m] == 0){
                    q.add(m);
                }
            }
            
        }
        return count == numCourses;  
    }
}