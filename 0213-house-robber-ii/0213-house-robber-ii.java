class Solution {
    public int rob(int[] nums) {
        
        int rob1 = 0;
        int rob2 = 0;
        int temp = 0;

        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 0){
            return 0;
        }

        for(int i=0; i<nums.length-1; i++){
            temp = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        int ans1 = rob2;

        rob1 = 0;
        rob2 = 0;
        temp = 0;

        for(int i=1; i<nums.length; i++){
            temp = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        int ans2 = rob2;
        return Math.max(ans1, ans2);        
    }
}