class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {

        ArrayList <Integer> list = new ArrayList <>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == x)
                list.add(i);
        }

        HashMap <Integer, Integer> map = new HashMap <>();
        for(int i:nums){
            if(i == x)
                map.put(i, map.getOrDefault(i, 0) +1);
        }

        int[] ans = new int[queries.length];
        int k = 0;
        for(int i=0; i<queries.length; i++){
            if(map.getOrDefault(x, 0) >= queries[i]){
                ans[k] = list.get(queries[i] - 1);
                k++;
            }
            else{
                ans[k] = -1;
                k++;
            }
        }
        return ans;
    }
}