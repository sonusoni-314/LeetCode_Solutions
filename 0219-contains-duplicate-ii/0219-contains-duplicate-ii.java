class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap <Integer, Integer> map = new HashMap <>();
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                sum = Math.abs(i-map.get(nums[i]));
                    if(sum <= k)
                        return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}