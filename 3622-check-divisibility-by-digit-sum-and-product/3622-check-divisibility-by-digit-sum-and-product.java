class Solution {
    public boolean checkDivisibility(int n) {

        int og = n;
        int sum = 0;
        int product = 1;

        while(n != 0){
            int digit = n%10;
            sum += digit;
            product *= digit;
            n /=10;
        }

        int val = sum + product;
        if(og % val == 0)
            return true;

        return false;        
    }
}