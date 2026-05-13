class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> num = new HashSet<>();
        for(int n:nums){
            num.add(n);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!num.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}