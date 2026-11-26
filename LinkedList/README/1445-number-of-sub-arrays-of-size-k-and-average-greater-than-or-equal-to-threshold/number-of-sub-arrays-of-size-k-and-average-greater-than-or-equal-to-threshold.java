class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left =0;
        int sum = 0;
        int count=0;
        for(int right=0;right<arr.length;right++){
            sum += arr[right]; 
            if(right >= k-1){
                if(sum >= threshold*k){
                count++;
                 }
                sum -= arr[left++];
            }
            
        }
        return count;
    }
}