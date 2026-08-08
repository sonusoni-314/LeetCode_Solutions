class Solution {
    public int smallestValue(int n) {

        int og = n;
        int sum = 0;
        int min = 0;

        while(true){

            sum = 0;

            for(int i = 2; i * i <= n; i++){

                while(n % i == 0){
                    sum += i;
                    n /= i;
                }
            }

            if(n > 1){
                sum += n;
            }

            if(sum == og){
                return sum;
            }

            n = sum;
            og = n;
        }
    }
}