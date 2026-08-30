class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[][] dp = new long[nums.length+1][2];
        for(int i=0; i<nums.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(0, 1, nums, dp);        
    }

    public long solve(int i, int flag, int[] nums, long[][] dp){
        if (i == nums.length)   return 0;

        if(dp[i][flag] != -1){
            return dp[i][flag];
        }

        long skip = solve(i+1, flag, nums, dp);
        long take;

        if(flag == 1){
            take = nums[i] + solve(i+1, 0, nums, dp);
        }
        else{
            take = -nums[i] + solve(i+1, 1, nums, dp);
        }
        return dp[i][flag] = Math.max(take, skip);
    }
}