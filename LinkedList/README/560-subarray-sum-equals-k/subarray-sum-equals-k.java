class Solution {
    public int subarraySum(int[] nums, int k) {
        int pre = 0;
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            pre += num;
            if(map.containsKey(pre - k)){
                count += map.get(pre -k);
            }
            map.put(pre, map.getOrDefault(pre, 0)+1);
        }
        return count;
    }
}