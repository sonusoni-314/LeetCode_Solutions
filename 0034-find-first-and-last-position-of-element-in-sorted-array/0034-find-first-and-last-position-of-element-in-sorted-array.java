class Solution {
    public int[] searchRange(int[] nums, int target) {

        int ub = -1;
        int lb = -1;

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while(left <= right){
            mid = left + (right-left)/2;

            if(nums[mid] >= target){
                lb = mid;
                right = mid - 1;
            }
            else
                left = mid + 1;
        }

        if(lb == -1 || nums[lb] != target)
            return new int[]{-1, -1};

        left = 0;
        right = nums.length - 1;

        while(left <= right){
            mid = left + (right-left)/2;

            if(nums[mid] > target){
                ub = mid;
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        
        if(ub == -1)
            return new int[]{lb, nums.length - 1};

        return new int[]{lb, ub - 1};
    }
}