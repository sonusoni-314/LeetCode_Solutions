class Solution {
    public int singleNonDuplicate(int[] nums) {

        HashMap <Integer, Integer> map = new HashMap <>();

        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) +1);
        }

        for(int x : map.keySet()){
            if(map.get(x) == 1){
                return x;
            }
        }
        return -1;
    }
}