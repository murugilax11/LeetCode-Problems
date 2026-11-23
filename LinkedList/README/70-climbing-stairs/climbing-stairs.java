class Solution {
    // Memoization
    // int solve(int n, int[] dp){
    //     if(n<= 1) return 1;
    //     if(dp[n] != -1){
    //         return dp[n];
    //     }
    //     return dp[n] = solve(n-1,dp)+solve(n-2,dp);
    // }
    public int climbStairs(int n) {
        if(n<=1) return 1;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
       // Memoization
    //    int[] dp = new int[n+1];
    //    Arrays.fill(dp,-1);
    //    return solve(n,dp);

        // Recursion call
        // if(n ==0 || n==1){
        //     return 1;
        // }
        // return climbStairs(n-1) + climbStairs(n-2);

    //   if(n <= 1)return 1;
    //   int num1 = 1;
    //   int num2 = 2;
    //   for(int i = 3; i <=n; i++){
    //     int temp = num1+num2;
    //     num1= num2;
    //     num2 = temp;
    //   }  
    //   return num2;
    }
}