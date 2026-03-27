class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
      List<int[]>[] adj = new List[n];  
      for(int i =0; i<n ;i++){
        adj[i] = new ArrayList<>();
      }

      for(int[] flight : flights){
        adj[flight[0]].add(new int[] {flight[1], flight[2]});
      }
        
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] =0;
        Queue<int[]> q =new LinkedList<>();
        q.add(new int[] {src,0,0});
        
        while(!q.isEmpty()){
            int[] node = q.poll();
            int source = node[0];
            int cost = node[1];
            int stop = node[2];

            if(stop >k) continue;
            for(int[] edge :adj[source]){
                int v= edge[0];
                int weight = edge[1];

                if(dist[v] > cost+weight){
                    dist[v] = cost+weight;
                    q.add(new int[] {v, dist[v], stop+1});
                }
            }
        }
       return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}