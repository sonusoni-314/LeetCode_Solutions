class Solution {
    public int[] findErrorNums(int[] nums) {

        HashSet <Integer> set = new HashSet <>();
        int[] ans = new int[2];

        int k = 0;
        int n = nums.length;

        for(int x:nums){
            if(!set.contains(x)){
                set.add(x);
            }
            else{
                ans[k] = x;
                k++;
            }
        }

        int exp = (n*(n+1))/2;
        int actual = 0;

        for(int x:set){
            actual = actual + x;
        }
        ans[k] = (exp-actual);
        return ans;
    }
}