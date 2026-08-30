class Solution {
    public int numDecodings(String s) {

        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        return solve(0, s, dp);
        
    }

    public int solve(int i, String s, int[] dp){
        if(i == s.length()){
            return 1;
        }

        if(s.charAt(i) == '0'){
            return 0;
        }

        if(dp[i] != -1) return dp[i];

        int take1 = solve(i+1, s, dp);

        int take2 = 0;

        if(i+1 < s.length()){
            if(s.charAt(i)=='1' || s.charAt(i)=='2' && s.charAt(i+1)<='6'){
                take2 = solve(i+2, s, dp);
            }
        }

        return dp[i] = take1 + take2;
    }
}