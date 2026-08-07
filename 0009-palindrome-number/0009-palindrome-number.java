class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        int rev = 0;
        int lastDigit = 0;
        int og = x;

        while(x!=0){
            lastDigit = x%10;
            rev = rev*10 + lastDigit;
            x = x/10;
        }
        if(rev == og){
            return true;
        }
        return false;
        
    }
}