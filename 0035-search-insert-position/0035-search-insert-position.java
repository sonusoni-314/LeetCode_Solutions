class Solution {
    public int searchInsert(int[] nums, int target) {

        int idx = nums.length;

        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        while(left <= right){
            mid = left + (right - left)/2;

            if(nums[mid] >= target){
                idx = mid;
                right = mid - 1;
            }
            else    left = mid + 1;
        }
        return idx;
    }
}