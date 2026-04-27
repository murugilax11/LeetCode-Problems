class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int pre =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i =0; i<nums.length;i++){
            pre+= nums[i];
            int rem = pre % k;
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(i - index > 1){
                    return true;
                }
            }
                else{
                    map.put(rem,i);
                }
            
        }
        return false;
    }
}