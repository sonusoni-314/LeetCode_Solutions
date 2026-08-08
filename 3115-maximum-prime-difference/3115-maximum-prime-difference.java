class Solution {
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public int maximumPrimeDifference(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int val = 0;

        while(left <= right){
            if(!isPrime(nums[left])){
                left++;
            }
            else if(!isPrime(nums[right])){
                right--;
            }
            else{
                val = right - left;
                return val;
            }
        }
        return 0;        
    }
}