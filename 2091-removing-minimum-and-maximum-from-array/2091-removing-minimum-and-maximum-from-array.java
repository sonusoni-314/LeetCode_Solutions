class Solution {
    public int minimumDeletions(int[] nums) {

        int maxElement = Integer.MIN_VALUE;
        int maxIndex = 0;

        for(int i=0; i<nums.length; i++){
            if(maxElement < nums[i]){
                maxElement = nums[i];
                maxIndex = i;
            }
        }

        int minElement = Integer.MAX_VALUE;
        int minIndex = 0;

        for(int i=0; i<nums.length; i++){
            if(minElement > nums[i]){
                minElement = nums[i];
                minIndex = i;
            }
        }

        // case 1 :
        int step1 = Math.max(minIndex, maxIndex) + 1;

        // case 2 :
        int step2 = nums.length - Math.min(minIndex, maxIndex);

        //case 3 :
        int step3 = (Math.min(minIndex, maxIndex) + 1) + (nums.length - Math.max(minIndex, maxIndex));

        return Math.min(step1, Math.min(step2, step3));        
    }
}