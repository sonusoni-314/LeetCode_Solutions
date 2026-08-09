class Solution {
    public int sumFourDivisors(int[] nums) {

        int x = 0, count = 0, n = 0, sum = 0, divisorSum = 0;
        while(x < nums.length){
            n = nums[x];
            count = 0;
            divisorSum = 0;

            for(int i=1; i*i<=n; i++){
                if(n%i == 0){
                    count++;
                    divisorSum += i;
                    if(i != n/i){
                        count++;
                        divisorSum += n/i;
                    }
                }
            }
            if(count == 4)
                sum += divisorSum;
            x++;
        }
        return sum;
    }
}