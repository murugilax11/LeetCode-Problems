class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int pre = 0;
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num :nums){
            pre += num;
            if(map.containsKey(pre -goal)){
                count += map.get(pre -goal);
            }
            map.put(pre, map.getOrDefault(pre, 0)+1);
        }
        return count;
    }
}