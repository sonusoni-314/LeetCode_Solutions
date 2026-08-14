class Solution {
    public boolean search(int[] nums, int target) {

        int mid = 0;
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            mid = low + (high-low)/2;

            if(nums[mid] == target) return true;

            if(nums[mid]==nums[low] && nums[mid]==nums[high]){
                low += 1;
                high -=1;
                continue;
            }

            if(nums[mid] >= nums[low]){
                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }

            }
            else{
                if(nums[high] >= target && target > nums[mid]){
                    low = mid + 1;
                }else{
                    high = mid -1;
                }
            }
        }
        return false;
    }
}