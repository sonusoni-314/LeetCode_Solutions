class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;
        int evenCount = 0;

        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            count = 0;

            while(x != 0){
                x/=10;
                count++;
            }
            if(count%2 == 0){
                evenCount++;
            }
        }
        return evenCount;        
    }
}