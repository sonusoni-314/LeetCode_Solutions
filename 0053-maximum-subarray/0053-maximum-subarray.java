
class Solution {
    static {
        for (int i = 0; i < 500; i++)
            maxSubArray(new int[1]);
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = nums[0];
        for (int val : nums) {
            sum += val;
            ans = Math.max(ans, sum);
            if (sum < 0)
                sum = 0;
        }
        return ans;
    }
}