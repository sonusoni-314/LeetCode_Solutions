class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap <Integer, Integer> map = new HashMap <>();
        long sum = 0;
        long max = 0;

        for(int i=0; i<k; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
            sum += nums[i];
        }

        if(map.size() == k){
            max = sum;
        }

        int left = 0;
        int right = k-1;

        while(right < nums.length-1){

            map.put(nums[left], map.get(nums[left]) -1);
            if(map.get(nums[left]) == 0){
                map.remove(nums[left]);
            }

            sum -= nums[left];

            left++;
            right++;

            map.put(nums[right], map.getOrDefault(nums[right], 0) +1);
            sum += nums[right];

            if(map.size() == k){
                max = Math.max(max, sum);   
            }
        }
        return max;
    }
}