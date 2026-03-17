class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
     Arrays.sort(candidates);
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
            if(i>start && cand[i] == cand[i-1])continue;
            temp.add(cand[i]);
            backtrack(cand, target - cand[i], res,temp,i+1);
            temp.remove(temp.size() - 1);
        }
    }
}