class Solution {
    public int sumFourDivisors(int[] nums) {

        int count = 0;
        int sum = 0;
        int divisorSum = 0;

        for(int x:nums){
            count = 0;
            divisorSum = 0;

            for(int i=1; i*i<=x; i++){
                if(x%i == 0){
                    count++;
                    divisorSum = divisorSum + i;
                    if(i != x/i){
                        count++;
                        divisorSum = divisorSum + (x/i);
                    }
                }
            }
            if(count == 4){
                    sum = sum + divisorSum;
            }
        }
        return sum;
    }
}