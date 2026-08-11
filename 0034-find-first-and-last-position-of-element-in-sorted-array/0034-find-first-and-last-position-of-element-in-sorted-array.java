class Solution {
    public int[] searchRange(int[] nums, int target) {

        int ub = -1;
        int lb = -1;

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        // Lower Bound: first index >= target
        while(left <= right){
            mid = left + (right - left) / 2;

            if(nums[mid] >= target){
                lb = mid;
                right = mid - 1;
            }
            else
                left = mid + 1;
        }

        // Target doesn't exist
        if(lb == -1 || nums[lb] != target)
            return new int[]{-1, -1};

        left = 0;
        right = nums.length - 1;

        // Upper Bound: first index > target
        while(left <= right){
            mid = left + (right - left) / 2;

            if(nums[mid] > target){
                ub = mid;
                right = mid - 1;
            }
            else
                left = mid + 1;
        }

        // If no element is greater than target,
        // target continues until the last index.
        if(ub == -1)
            return new int[]{lb, nums.length - 1};

        return new int[]{lb, ub - 1};
    }
}