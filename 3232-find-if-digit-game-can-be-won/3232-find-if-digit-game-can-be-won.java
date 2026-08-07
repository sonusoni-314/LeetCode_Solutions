class Solution {
    public boolean canAliceWin(int[] nums) {

        int single = 0;
        int doublee = 0;

        for(int x : nums){
            int digits = (int)Math.log10(x) + 1;
            if(digits == 1){
                single = single + x;
            }else{
                doublee = doublee + x;
            }
        }
        if(single != doublee){
            return true;
        }
        return false;        
    }
}