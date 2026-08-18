class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        return solve(0, nums, dp);                
    }

    public int solve(int i, int[] nums, int[] dp){
        if(i >= nums.length)
            return 0;

        if(dp[i] != -1)
            return dp[i];

        int steal = nums[i] + solve(i+2, nums, dp);
        int skip = solve(i+1, nums, dp);
        return dp[i] = Math.max(steal, skip);
    }
}












        // int rob1 = 0;
        // int rob2 = 0;
        // int temp = 0;

        // for(int i=0; i<nums.length; i++){
        //     temp = Math.max(rob1 + nums[i], rob2);
        //     rob1 = rob2;
        //     rob2 = temp;
        // }
        // return rob2;