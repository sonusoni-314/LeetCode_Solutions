class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        int profit = 0;

        for(int x:prices){

            if(x > minPrice){
                profit = x - minPrice;
                max = Math.max(max, profit);
            }
            minPrice = Math.min(x, minPrice);
        }
        return max;
    }
}