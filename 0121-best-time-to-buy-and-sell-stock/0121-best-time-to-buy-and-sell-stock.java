class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        int profit = 0;

        for(int x:prices){

            minPrice = Math.min(x, minPrice);
            if(x > minPrice){
                profit = x - minPrice;
                max = Math.max(max, profit);
            }
        }
        return max;
    }
}