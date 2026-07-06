class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];
        int k = ans.length-1;
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];

            if(leftsq < rightsq){
                ans[k] = rightsq;
                right--;
                k--;
            }
            else{
                ans[k] = leftsq;
                left++;
                k--;
            }
        }
        return ans;
    }
}