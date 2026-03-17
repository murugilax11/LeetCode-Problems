    class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target,res,new ArrayList<>(),0);
        return res;
    }
    private void backtrack(int[] cand, int target, List<List<Integer>> res, List<Integer> temp,int start) 
                           {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0) return;
        for (int i = start; i < cand.length; i++) {
            temp.add(cand[i]);
            backtrack(cand, target - cand[i], res,temp,i);
            temp.remove(temp.size() - 1);
        }
    }
}    