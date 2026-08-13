class Solution {
    public int findNumbers(int[] nums) {

// Approach 1:

        int count = 0;
        int digits = 0;
        for(int i=0; i<nums.length; i++){
            digits = (int)Math.log10(nums[i]) + 1;
            if(digits%2 == 0){
                count++;
            }
        }
        return count;

// Approach 2:

        // int count = 0;
        // int digits = 0;

        // for(int x:nums){
        //     digits = 0;
        //     while(x != 0){
        //         x = x/10;
        //         digits++;
        //     }
        //     if(digits%2 == 0){
        //         count++;
        //     }
        // }
        // return count;
    }
}