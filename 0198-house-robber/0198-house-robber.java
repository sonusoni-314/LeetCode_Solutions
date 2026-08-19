class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];

        if(n == 1){
            return nums[0];
        }

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);


        for(int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }
        return dp[n-1];
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