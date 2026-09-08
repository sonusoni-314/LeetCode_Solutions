class Solution {
    public int countCommas(int n) {

        if(n<1000){
            return 0;
        }

        int ans = n - 999;
        return ans;

        // 1,000
        // 1,001
        // 9,999
        // 10,000
        // 99,999
        // 100,000
        
    }
}