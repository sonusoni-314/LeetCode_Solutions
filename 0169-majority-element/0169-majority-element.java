class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length/2;
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) +1);
        }

        for(int x: map.keySet()){
            if(map.get(x) > n){
                return x;
            }
        }
        return -1;        
    }
}