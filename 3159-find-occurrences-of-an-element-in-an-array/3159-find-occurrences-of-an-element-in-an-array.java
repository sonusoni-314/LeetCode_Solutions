class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {

        ArrayList <Integer> list = new ArrayList <>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == x)
                list.add(i);
        }

        int[] ans = new int[queries.length];
        int k = 0;
        for(int i=0; i<queries.length; i++){
            if(list.size() >= queries[i]){
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