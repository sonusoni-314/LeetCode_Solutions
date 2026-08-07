class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int exp = (n*(n+1))/2;
        int actual = 0;

        for(int i=0; i<nums.length; i++){
            actual += nums[i];
        }
        return exp - actual;        
    }
}