class Solution {
    public int numDecodings(String s) {

        int n = s.length();

        int[] dp = new int[n+1];

        dp[n] = 1;

        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == '0'){
                dp[i] = 0;
            }
            else{
                dp[i] += dp[i+1];
                if(i+1 < n){
                    if(s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i+1) <= '6'){
                        dp[i] += dp[i+2];
                    }
                }
            }
        }
        return dp[0];
    }
}

// class Solution {
//     public int numDecodings(String s) {

//         int[] memo = new int[s.length() + 1];
//         Arrays.fill(memo, -1);
//         return solve(0, s, memo);
        
//     }

//     public int solve(int i, String s, int[] memo){
//         if(i == s.length()){
//             return 1;
//         }

//         if(s.charAt(i) == '0'){
//             return 0;
//         }

//         if(memo[i] != -1)   return memo[i];

//         int take1 = solve(i+1, s, memo);
//         int take2 = 0;

//         if(i+1 < s.length()){
//             if(s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i+1) <= '6'){
//                 take2 = solve(i+2, s, memo);
//             }
//         }

//         return memo[i] = take1 + take2;
//     }
// }