class Solution {
    public void sortColors(int[] nums) {
        int low =0;
        int mid =0;
        int high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        // int n=nums.length;
        // for(int i =0; i < n; i++){
        //     for(int j = i; j < n;j++){
        //     if(nums[i] > nums[j] ){
        //         int temp =nums[j];
        //          nums[j] = nums[i];
        //          nums[i] = temp;
        //     }
        // }
        // }
    }
}