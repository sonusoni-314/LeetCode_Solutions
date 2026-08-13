class Solution {
    public int[] findErrorNums(int[] nums) {

        HashSet <Integer> set = new HashSet <>();
        int[] ans = new int[2];

        int n = nums.length;

        for(int x:nums){
            if(!set.contains(x))
                set.add(x);
            else
                ans[0] = x;
        }

        int exp = (n*(n+1))/2;
        int actual = 0;

        for(int x:set)
            actual = actual + x;
            
        ans[1] = (exp-actual);
        
        return ans;
    }
}