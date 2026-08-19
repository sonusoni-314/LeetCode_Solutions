class Solution {
    public int maxSubArray(int[] nums) {

        int currSum = 0;
        int max = Integer.MIN_VALUE;

        if(nums.length == 1 && nums[0] < 0){
            return nums[0];
        }

        for(int x:nums){
            currSum = currSum + x;
            max = Math.max(currSum, max);

            if(currSum<0){
                currSum = 0;
            }
        }
        return max;
    }
}