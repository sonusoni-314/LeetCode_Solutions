class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        double max = 0;

        int left = 0;
        int right = k-1;

        for(int i=0; i<k; i++){
            sum+= nums[i];
        }

        max = sum/k;

        while(right < nums.length-1){

            sum -= nums[left];
            left++;
            right++;
            sum+= nums[right];

            max = Math.max(sum/k, max);
        }
        return max;
    }
}