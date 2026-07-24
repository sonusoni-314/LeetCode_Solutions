class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n];
        long sum = 0;

        Arrays.fill(ans, -1);

        if((2*k)+1 > n){
            return ans;
        }

        for(int x=0; x<2*k+1; x++){
            sum+=nums[x];
        }

        int left = 0;
        int right = 2*k;
        int i = k;

        while(right<n){

            ans[i] = (int)(sum/(2*k+1));

            sum -= nums[left];

            left++; right++;
            i++;

            if(right < n)
                sum += nums[right];
        }
        
        return ans;
        
    }
}