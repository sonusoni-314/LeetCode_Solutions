class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);

        int first = nums[n-1]-1;
        int sec = nums[n-2]-1;

        return first*sec;
        
    }
}