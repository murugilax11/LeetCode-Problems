class Solution {
void backtrack(int[] nums, List<List<Integer>> res, List<Integer> temp,boolean[] visit){
        if(temp.size() == nums.length){
            if(!res.contains(temp))
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<nums.length;i++){
            if(visit[i])continue;
            visit[i] = true;
            temp.add(nums[i]);
            backtrack(nums,res,temp,visit);
            temp.remove(temp.size()-1);
            visit[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visit = new boolean[nums.length];
        backtrack(nums,res,temp,visit);
        return res;
    }
}