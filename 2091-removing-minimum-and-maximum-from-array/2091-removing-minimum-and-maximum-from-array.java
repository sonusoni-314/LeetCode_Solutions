class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        if(n == 1){
            return 1;
        }

        int max = Integer.MIN_VALUE;
        int maxidx = 0;

        for(int i=0; i<n; i++){
            if(max < nums[i]){
                max = nums[i];
                maxidx = i;
            }
        }

        int min = Integer.MAX_VALUE;
        int minidx = 0;

        for(int i=0; i<n; i++){
            if(min > nums[i]){
                min = nums[i];
                minidx =  i;
            }
        }        

        int step1 = 0;
        //case 1:
        step1 = Math.max(maxidx, minidx) + 1;

        int step2 = 0;
        //case2:
        step2 = n - Math.min(maxidx, minidx);

        int step3 = 0;
        step3 = (Math.min(maxidx, minidx) + 1) + (n - Math.max(maxidx, minidx));

        return Math.min(step1, Math.min(step2, step3));


        
    }
}