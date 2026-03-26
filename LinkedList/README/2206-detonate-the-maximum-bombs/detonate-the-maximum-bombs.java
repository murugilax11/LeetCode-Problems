class Solution {
    int dfs(int i, boolean[] visit, List<List<Integer>> adj){
        visit[i] = true;
        int count =1;

        for(int nei : adj.get(i)){
         if(!visit[nei]){
            count += dfs(nei,visit,adj);
         }
        }
        return count;
    }
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;

        //create graph
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0; i<n;i++){
            adj.add(new ArrayList<>());
        }

        // build graph using distance formula
        for(int i =0; i<n ;i++){
            long x1 = bombs[i][0];
            long y1 = bombs[i][1];
            long r1 = bombs[i][2];

            for(int j=0; j<n;j++){
                long x2 = bombs[j][0];
                long y2 = bombs[j][1];

                long dx = x1-x2;
                long dy = y1-y2;

                if(dx*dx + dy*dy <= r1*r1){
                    adj.get(i).add(j);
                }
            }
        }

        //DFS process
        int max =0;
        for(int i =0; i<n; i++){
            boolean[] visit = new boolean[n];
            int count = dfs(i,visit,adj);
            max = Math.max(max, count);
        }
        return max;
    }
}