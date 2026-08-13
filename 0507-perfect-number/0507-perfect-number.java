class Solution {
    public boolean checkPerfectNumber(int num) {

        if(num<=1)  return false;

        int sum = 0;
        int og = num;

        for(int i=1; i*i<=num; i++){
            if(num%i == 0){
                sum += i;
                if(i != num/i && num/i != num){
                    sum += num/i;
                }
            }
        }
        if(sum == og)   return true;
        return false;
    }
}