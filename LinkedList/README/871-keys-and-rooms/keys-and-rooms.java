class Solution {

    void dfs(int node, boolean[] visit, List<List<Integer>> room){
         visit[node] = true;
        for(int keys : room.get(node)){
         if(!visit[keys]){
            dfs(keys,visit,room);
         }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
           List<List<Integer>> adj = new ArrayList<>();
        for(int i =0; i<rooms.size();i++){
            adj.add(new ArrayList<>());
        }
        
        boolean[] visit = new boolean[rooms.size()];
         dfs(0,visit,rooms);

         for(boolean check : visit){
          if(!check) return false;
         }
       return true;
    }
}