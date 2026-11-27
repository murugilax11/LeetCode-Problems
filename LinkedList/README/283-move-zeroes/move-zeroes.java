class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if( nums[j] !=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        // int cur = 0;
        // for(int i =0; i <nums.length;i++){
        //     if(nums[i] != 0){
        //         nums[cur] = nums[i];
        //         cur++;
        //     }
        // }
        //     while(cur < nums.length){
        //         nums[cur] = 0;
        //         cur++;
        //     }
        
    }
}