class Solution {
    public int smallestNumber(int n, int t) {
        boolean found = true;
        int x = 0;
        int prod = 1;
        int digit = 0;

        for(int i=n; i<=100; i++){
            x = i;
            while(x != 0){
                digit = x%10;
                prod = digit*prod;
                x/=10;
            }
            if(prod%t == 0){
                return i;
            }
            prod = 1;
        }
        return -1;        
    }
}