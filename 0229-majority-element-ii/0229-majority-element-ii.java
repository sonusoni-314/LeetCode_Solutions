class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap <Integer, Integer> map = new HashMap <>();
        int n = nums.length/3;

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList <Integer> list = new ArrayList<>();
        for(int num: map.keySet()){
            if(map.get(num) > n){
                list.add(num);
            }
        }
        return list;        
    }
}